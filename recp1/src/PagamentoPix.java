public class PagamentoPix extends Pagamento {
    private String chavePix;
    private String codigoCopiaECola;

    // Construtor
    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
        this.codigoCopiaECola = gerarCodigo();
    }

    // Getters e Setters
    public String getChavePix() { return chavePix; }
    public void setChavePix(String chavePix) { this.chavePix = chavePix; }

    public String getCodigoCopiaECola() { return codigoCopiaECola; }
    public void setCodigoCopiaECola(String codigoCopiaECola) { this.codigoCopiaECola = codigoCopiaECola; }

    private String gerarCodigo() {
        return "00020126580014BR.GOV.BCB.PIX0136" + chavePix + "52040000530398654";
    }

    @Override
    public void processar() {
        System.out.println("Gerando QR Code Pix...");
        System.out.println("Copia e cola: " + codigoCopiaECola);
        setAprovado(true);
    }
}