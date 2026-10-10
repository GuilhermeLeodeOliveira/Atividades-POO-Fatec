import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date data;
    private StatusPedido status;
    private Cliente cliente;            // AGREGAÇÃO: cliente existe sem o pedido
    private Endereco enderecoEntrega;   // AGREGAÇÃO
    private List<ItemPedido> itens;     // COMPOSIÇÃO: itens só existem dentro do pedido
    private Pagamento pagamento;        // ASSOCIAÇÃO

    // Construtor
    public Pedido(int id, Cliente cliente, Endereco enderecoEntrega) {
        this.id = id;
        this.data = new Date();
        this.status = StatusPedido.EM_PREPARO;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>(); // composição: o pedido cria e gerencia seus itens
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public StatusPedido getStatus() { return status; }
    public void setStatus(StatusPedido status) { this.status = status; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Endereco getEnderecoEntrega() { return enderecoEntrega; }
    public void setEnderecoEntrega(Endereco enderecoEntrega) { this.enderecoEntrega = enderecoEntrega; }

    public List<ItemPedido> getItens() { return itens; }

    public Pagamento getPagamento() { return pagamento; }
    public void setPagamento(Pagamento pagamento) { this.pagamento = pagamento; }

    // COMPOSIÇÃO: o pedido adiciona itens à sua própria lista
    public void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void atualizarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
        System.out.println("Pedido #" + id + " atualizado para: " + novoStatus);
    }

    public void confirmarPagamento() {
        if (pagamento != null) {
            pagamento.processar();
        }
    }
}