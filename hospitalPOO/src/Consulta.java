public class Consulta {
    public String data;
    public String hora;
    public String medico;
    public String paciente;
    public String motivo;
    public String historico;

    public void marcar(){
        System.out.println("Marcando Consulta");
    }

    public void cancelar(){
        System.out.println("Cancelando Consulta");
    }

    public void mostrar() {
        System.out.println("--- Consulta ---");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico + "\n");
    }

    public void realizar(){
        System.out.println("Realizando Consulta");
    }

    public void atualizar(){
        System.out.println("Atualizando Consulta");
    }
}
