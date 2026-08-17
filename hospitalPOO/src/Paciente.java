public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;


    public void cadastrar(){
        System.out.println("Cadastrando Paciente");
        
        System.out.println("Paciente cadastrado com sucesso");
    }

    public void mostrar(){
        System.out.println("--- Paciente ---");
        System.out.println("Nome: "+nome);
        System.out.println("CPF:"+cpf);
        System.out.println("Telefone: "+telefone);
        System.out.println("Gênero: "+genero);
        System.out.println("Idade: "+idade + "\n");
    }
}

