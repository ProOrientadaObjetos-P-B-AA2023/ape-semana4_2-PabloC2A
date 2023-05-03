package ejecutor;

public class Ejecutor {
    public static void main(String[] args) {
        Provincia provincia1 = new Provincia("Quito",522657);
        Profesor profesor1 = new Profesor("Fernando","Jaramillo",800,"1104724596",provincia1);
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
    }
}
