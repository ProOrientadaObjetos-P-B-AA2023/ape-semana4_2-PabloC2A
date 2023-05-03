package ejecutor;

public class Provincia {
    //Atributos
    private String nombre;
    private long numeroHabitantes;
    //Constructores
    public Provincia() {
    }

    public Provincia(String nombre, long numeroHabitantes) {
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(long numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", numeroHabitantes=" + numeroHabitantes +
                '}';
    }
}
