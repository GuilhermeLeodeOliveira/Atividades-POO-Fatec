public class Paciente {
    private int codigo;
    private String nome;
    private String telefone;
    private char genero;
    private int idade;
    private String email;
    private String senha;

    public Paciente() {
    }

    public Paciente(int _codigo, String _nome, String _email, int _idade, char _genero) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.email = _email;
        this.idade = _idade;
        this.genero = _genero;
    }

    public Paciente(int codigo, String nome, String telefone, String email, int idade, char genero, String senha) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
        this.senha = senha;
    }

    public void cadastrar() {
        System.out.println("Cadastrando Paciente");
        // TODO
        System.out.println("Paciente cadastrado com sucesso");
    }

    public void mostrar() {
        System.out.println("--- Paciente ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Idade: " + this.idade + "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isBlank()) {
            throw new Exception("Nome é obrigatório!");
        } else {
            this.nome = nome;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws Exception {
        if (codigo <= 0) {
            throw new Exception("Código é obrigatório e deve ser positivo!");
        } else {
            this.codigo = codigo;
        }
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.isBlank() || email.isEmpty()) {
            throw new Exception("Email é Obrigatório!");
        } else {
            this.email = email;
        }
    }

    public String getSenha() {
        return "*************";
    }

    public void setSenha(String senha) throws Exception {
        if (senha.isBlank() || senha.isEmpty()) {
            throw new Exception("Senha é Obrigatória!");
        } else {
            this.senha = senha;
        }
    }

}