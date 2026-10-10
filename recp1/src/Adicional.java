import java.util.ArrayList;
import java.util.List;

public class Pizza extends Produto {
    private String tamanho;          // P, M, G
    private String sabor;
    private boolean bordaRecheada;
    private boolean meioAMeio;
    private List<Adicional> adicionais; // AGREGAÇÃO: adicionais existem independentes

    // Construtor
    public Pizza(int id, String nome, double preco, String tamanho, String sabor) {
        super(id, nome, preco);
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.bordaRecheada = false;
        this.meioAMeio = false;
        this.adicionais = new ArrayList<>();
    }

    // Getters e Setters
    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    public boolean isBordaRecheada() { return bordaRecheada; }
    public void setBordaRecheada(boolean bordaRecheada) { this.bordaRecheada = bordaRecheada; }

    public boolean isMeioAMeio() { return meioAMeio; }
    public void setMeioAMeio(boolean meioAMeio) { this.meioAMeio = meioAMeio; }

    public List<Adicional> getAdicionais() { return adicionais; }

    // Método da agregação
    public void adicionarAdicional(Adicional adicional) {
        this.adicionais.add(adicional);
    }

    public double calcularPrecoTotal() {
        double total = getPreco();
        for (Adicional a : adicionais) {
            total += a.getPreco();
        }
        return total;
    }
}