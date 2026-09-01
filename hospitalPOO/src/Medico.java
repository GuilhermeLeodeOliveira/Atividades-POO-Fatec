public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico() {
    }

    public Medico(String nome, String crm, String telefone, String especialidade, String senha) throws Exception {
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public void setSenha(String senha) throws Exception {
        if (senha.isBlank() || senha.isEmpty())
            throw new Exception("Senha é Obrigatória!");
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty() || nome.isBlank()) {
            throw new Exception("O nome do médico é obrigatorio!");
        } else {
            this.nome = nome;
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if (crm.isBlank() || crm.isEmpty()) {
            throw new Exception("Crm é Obrigatório!");
        } else {

            this.crm = crm;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws Exception {
        if (especialidade.isBlank() || especialidade.isEmpty()) {

            throw new Exception("Especialidade é Obrigatória!");
        } else {

            this.especialidade = especialidade;
        }
    }

    public String getSenha() {
        return "*************";
    }

}
