public class Bebida extends Produto {
    private int volumeMl;

    // Construtor
    public Bebida(int id, String nome, double preco, int volumeMl) {
        super(id, nome, preco);
        this.volumeMl = volumeMl;
    }

    // Getters e Setters
    public int getVolumeMl() { return volumeMl; }
    public void setVolumeMl(int volumeMl) { this.volumeMl = volumeMl; }
}