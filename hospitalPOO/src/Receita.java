public class Receita {
    public String consulta;
    public String data;
    public String descritivo;

    public void preescrever(){
        System.out.println("Prescrevendo Receita");
    }

    public void mostrar() {
        System.out.println("--- Receita ---");
        System.out.println("Consulta ID/Ref: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descritivo: " + descritivo + "\n");
    }

}
