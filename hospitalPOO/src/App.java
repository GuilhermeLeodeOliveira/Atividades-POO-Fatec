public class App {
    public static void main(String[] args) throws Exception {
        
        Paciente p1 = new Paciente();
        p1.nome = "Guilherme Leo";
        p1.cpf = "123.456.789-00";
        p1.telefone = "(11) 91234-5678";
        p1.genero = "Masculino";
        p1.idade = 23;

        Medico m1 = new Medico();
        m1.nome = "Laura Araujo";
        m1.crm = "123456-SP";
        m1.telefone = "(11) 91234-5678";
        m1.especialidade = "Cardiologia";
        m1.setSenha("med123");

        Recepcionista r1 = new Recepcionista();
        r1.nome = "Mariana Lopes";
        r1.cpf = "987.654.321-11";
        r1.telefone = "(11) 95555-4444";
        r1.setSenha("rec456");

        Agenda a1 = new Agenda();
        a1.data = "20/08/2026";
        a1.hora = "14:00";
        a1.medico = m1.nome;
        a1.paciente = p1.nome;

        Consulta c1 = new Consulta();
        c1.data = "20/08/2026";
        c1.hora = "14:00";
        c1.medico = m1.nome;
        c1.paciente = p1.nome;
        c1.motivo = "Check-up de rotina";
        c1.historico = "Sem queixas anteriores";

        Receita rec1 = new Receita();
        rec1.consulta = "Consulta #001";
        rec1.data = "20/08/2026";
        rec1.descritivo = "Tomar vitamina D 1x ao dia.";

        Exame e1 = new Exame();
        e1.consulta = "Consulta #001";
        e1.data = "20/08/2026";
        e1.descritivo = "Hemograma completo";

        p1.mostrar();
        m1.mostrar();
        r1.mostrar();
        a1.mostrar();
        c1.mostrar();
        rec1.mostrar();
        e1.mostrar();

    }
}
