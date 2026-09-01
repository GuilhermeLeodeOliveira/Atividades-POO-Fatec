public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta() {
    }

    public Consulta(String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
        this.historico = historico;
    }

    public void marcar() {
        System.out.println("Marcando Consulta");
    }

    public void cancelar() {
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

    public void realizar() {
        System.out.println("Realizando Consulta");
    }

    public void atualizar() {
        System.out.println("Atualizando Consulta");
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws Exception {
        if (motivo.isBlank() || motivo.isEmpty()) {

            throw new Exception("Motivo é Obrigatório!");
        } else {

            this.motivo = motivo;
        }
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) throws Exception {
        if (historico == null) {
            throw new Exception("Histórico é obrigatório!");
        } else {

            this.historico = historico;
        }
    }

}
