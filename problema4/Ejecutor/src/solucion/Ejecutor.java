package solucion;

public class Ejecutor {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco Pichincha",154);
        Cliente cliente1 = new Cliente("Pablo Andres","Criollo Alvarez","1150232101");
        Cheque cheque1 = new Cheque(cliente1,banco1,1764.46);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }
}
