public class PagamentoCarteiraDigital extends Pagamento {
    private String nomeCarteira;

    // Construtor
    public PagamentoCarteiraDigital(double valor, String nomeCarteira) {
        super(valor);
        this.nomeCarteira = nomeCarteira;
    }

    // Getters e Setters
    public String getNomeCarteira() { return nomeCarteira; }
    public void setNomeCarteira(String nomeCarteira) { this.nomeCarteira = nomeCarteira; }

    @Override
    public void processar() {
        System.out.println("Processando pagamento via carteira digital " + nomeCarteira);
        setAprovado(true);
    }
}