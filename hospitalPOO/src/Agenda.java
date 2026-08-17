public class Agenda {
    public String data;
    public String hora;
    public String medico;
    public String paciente;

    public void mostrar() {
        System.out.println("--- Agenda ---");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente + "\n");
    }
}
