public class Agenda {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda() {
    }

    public Agenda(String data, String hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void mostrar() {
        System.out.println("--- Agenda ---");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente + "\n");
    }

    public void consultar() {
        // TODO
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data.isBlank() || data.isEmpty()) {
            throw new Exception("A data precisa ser preenchida!");
        } else {

            this.data = data;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) throws Exception {
        if (hora.isBlank() || hora.isEmpty()) {
            throw new Exception("A hora precisa ser preenchida!");
        } else {

            this.hora = hora;
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) throws Exception {
        if (medico == null) {
            throw new Exception("Médico é obrigatório!");
        } else if (medico.getNome() == null || medico.getNome().isBlank() || medico.getNome().isEmpty()) {
            throw new Exception("Médico precisa ter um nome válido!");
        } else {

            this.medico = medico;
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) throws Exception {
        if (paciente == null) {
            throw new Exception("Paciente é obrigatório!");
        } else if (paciente.getNome() == null || paciente.getNome().isBlank() || paciente.getNome().isEmpty()) {
            throw new Exception("Paciente precisa ter um nome válido!");
        } else if (paciente.getCodigo() <= 0) {
            throw new Exception("Paciente precisa ter um código válido!");
        } else {
            this.paciente = paciente;
        }
    }

}
