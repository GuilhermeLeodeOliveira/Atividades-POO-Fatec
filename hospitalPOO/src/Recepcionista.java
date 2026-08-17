public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void mostrar() {
        System.out.println("--- Recepcionista ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + this.senha + "\n");
    }

}
