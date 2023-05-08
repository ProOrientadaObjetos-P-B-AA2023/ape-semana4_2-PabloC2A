package solucion;

public class Cheque {
    //Atributos
    private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comision;
    //Constructores
    public Cheque() {
    }

    public Cheque(Cliente cliente, Banco banco, double valorCheque) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorCheque = valorCheque;
    }
    //Metodos
    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void calcularComision() {
        this.comision = this.valorCheque * (this.valorCheque * 0.003 / (double) 100);
    }
    //toString
    @Override
    public String toString() {
        return String.format("""
                ----- INFORMACION DEL CHEQUE -----
                -Nombre del Cliente: %s
                -Apellido del Cliente: %s
                -Cedula del Cliente: %s
                -Nombre del Banco: %s
                -Valor del Cheque: %.2f
                -Comision: %.2f
                """,cliente.getNombre(), cliente.getApellido(), cliente.getCedula(), banco.getNombre(), this.getValorCheque(), this.getComision());
    }
}
