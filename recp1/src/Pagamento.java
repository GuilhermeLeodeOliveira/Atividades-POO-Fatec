public abstract class Pagamento {
    private double valor;
    private boolean aprovado;

    // Construtor
    public Pagamento(double valor) {
        this.valor = valor;
        this.aprovado = false;
    }

    // Getters e Setters
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public boolean isAprovado() { return aprovado; }
    public void setAprovado(boolean aprovado) { this.aprovado = aprovado; }

    // Método abstrato: cada forma de pagamento implementa do seu jeito
    public abstract void processar();
}