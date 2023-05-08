package ejecutor;

public class Fabricante {
    //Atributos
    private String nombre;
    private String ciudadOrigen;
    //Constructores
    public Fabricante() {
    }

    public Fabricante(String nombre, String ciudadOrigen) {
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    //Metodo toString
    @Override
    public String toString() {
        return String.format("""
                ----- FABRICANTE -----
                -Nombre: %s
                -Ciudad de Origen: %s
                """, this.getNombre(), this.getCiudadOrigen());
    }
}
