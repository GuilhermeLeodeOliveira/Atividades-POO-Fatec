public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    // Construtor
    public PagamentoCartao(double valor, String numeroCartao, int parcelas) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    // Getters e Setters
    public String getNumeroCartao() { return numeroCartao; }
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; }

    public int getParcelas() { return parcelas; }
    public void setParcelas(int parcelas) { this.parcelas = parcelas; }

    @Override
    public void processar() {
        System.out.println("Processando pagamento no cartão " + numeroCartao
                + " em " + parcelas + "x de R$ " + String.format("%.2f", getValor() / parcelas));
        setAprovado(true);
    }
}