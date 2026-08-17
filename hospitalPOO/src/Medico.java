public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void mostrar() {
        System.out.println("--- Médico ---");
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Telefone: " + telefone);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Senha: " + this.senha + "\n");
    }

}
