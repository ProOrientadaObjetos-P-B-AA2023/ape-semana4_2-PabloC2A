package solucion;

public class Banco {
    //Atributos
    private String nombre;
    private int numeroSucursales;
    //Constructores
    public Banco() {
    }

    public Banco(String nombre, int numeroSucursales) {
        this.nombre = nombre;
        this.numeroSucursales = numeroSucursales;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }
    //toString
    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", numeroSucursales=" + numeroSucursales +
                '}';
    }
}
