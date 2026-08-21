public class Receita {
    private Consulta consulta;
    private String data;
    private String descritivo;

    public void preescrever(){
        System.out.println("Prescrevendo Receita");
    }

    public void mostrar() {
        System.out.println("--- Receita ---");
        System.out.println("Consulta ID/Ref: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descritivo: " + descritivo + "\n");
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    

    

}
