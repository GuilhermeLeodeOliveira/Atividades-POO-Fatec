public class Notificacao {
    private String mensagem;
    private Cliente destinatario; // ASSOCIAÇÃO

    // Construtor
    public Notificacao(String mensagem, Cliente destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    // Getters e Setters
    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public Cliente getDestinatario() { return destinatario; }
    public void setDestinatario(Cliente destinatario) { this.destinatario = destinatario; }

    public void enviar() {
        System.out.println("[NOTIFICAÇÃO] Para " + destinatario.getNome()
                + " (" + destinatario.getEmail() + "): " + mensagem);
    }
}