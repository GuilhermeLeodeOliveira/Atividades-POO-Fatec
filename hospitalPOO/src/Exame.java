public class Exame {
    
    public String consulta;
    public String data;
    public String descritivo;
    
    public void solicitar(){
        System.out.println("Solicitando Exame");
    }

    public void mostrar() {
        System.out.println("--- Exame ---");
        System.out.println("Consulta ID/Ref: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descritivo: " + descritivo + "\n");
    }

}
