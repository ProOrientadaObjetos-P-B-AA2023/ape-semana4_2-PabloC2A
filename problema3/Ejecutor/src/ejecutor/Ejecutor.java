package ejecutor;

public class Ejecutor {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Toyota","Japon");
        Automotor automotor1 = new Automotor("1104722874",fabricante1,"2014",22000);
        automotor1.calcularValorMatriculaAutomotor();
        System.out.println(automotor1);
    }
}
