public class App {
    public static void main(String[] args) throws Exception {
        
        Paciente p1 = new Paciente();
        p1.setNome("Guilherme Leo");
        p1.setCpf("123.456.789-00");
        p1.setTelefone("(11) 91234-5678");
        p1.setGenero("Masculino");
        p1.setIdade(23);

        Medico m1 = new Medico();
        m1.setNome("Laura Araujo");
        m1.setCrm("123456-SP");
        m1.setTelefone("(11) 91234-5678");
        m1.setEspecialidade("Cardiologia");
        m1.setSenha("med123");

        Recepcionista r1 = new Recepcionista();
        r1.setNome("Mariana Lopes");
        r1.setCpf("987.654.321-11");
        r1.setTelefone("(11) 95555-4444");
        r1.setSenha("rec456");

        Agenda a1 = new Agenda();
        a1.setData("20/08/2026");
        a1.setHora("14:00");
        a1.setMedico(m1);
        a1.setPaciente(p1);

        Consulta c1 = new Consulta();
        c1.setData("20/08/2026");
        c1.setHora("14:00");
        c1.setMedico(m1);
        c1.setPaciente(p1);
        c1.setMotivo("Check-up de rotina");
        c1.setHistorico("Sem queixas anteriores");

        Receita rec1 = new Receita();
        rec1.setConsulta(c1);
        rec1.setData("20/08/2026");
        rec1.setDescritivo("Tomar vitamina D 1x ao dia.");

        Exame e1 = new Exame();
        e1.setConsulta(c1);
        e1.setData("20/08/2026");
        e1.setDescritivo("Hemograma completo");

        p1.mostrar();
        m1.mostrar();
        r1.mostrar();
        a1.mostrar();
        c1.mostrar();
        rec1.mostrar();
        e1.mostrar();

    }
}
