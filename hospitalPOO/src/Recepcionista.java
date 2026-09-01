public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista() {
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void mostrar() {
        System.out.println("--- Recepcionista ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Senha: " + this.senha + "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isBlank()){
            throw new Exception("Nome é obrigatório!");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception{
        if(cpf.isBlank()){
            throw new Exception("CPF é obrigatório!");
        } else {
            this.cpf = nome;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "*************";
    }

    public void setSenha(String senha) throws Exception{
        if(senha.isBlank() || senha.isEmpty()){
            throw new Exception("Senha é Obrigatória!");
        }else{
            this.senha = senha;
    
        }

    }
}
