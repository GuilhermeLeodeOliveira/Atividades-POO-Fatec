import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Produto> produtos; // AGREGAÇÃO: produtos existem independentes do cardápio

    // Construtor
    public Cardapio() {
        this.produtos = new ArrayList<>();
    }

    // Getter
    public List<Produto> getProdutos() { return produtos; }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public Produto buscarProduto(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void atualizarPreco(int id, double novoPreco) {
        Produto p = buscarProduto(id);
        if (p != null) {
            p.setPreco(novoPreco);
            System.out.println("Preço de " + p.getNome() + " atualizado para R$ "
                    + String.format("%.2f", novoPreco));
        }
    }

    public void exibirCardapio() {
        System.out.println("\n===== CARDÁPIO DIGITAL =====");
        for (Produto p : produtos) {
            String status = p.isDisponivel() ? "disponível" : "indisponível";
            System.out.println("[" + p.getId() + "] " + p.getNome()
                    + " - R$ " + String.format("%.2f", p.getPreco()) + " (" + status + ")");
        }
    }
}