package ejecutor;

public class Profesor {
    //Atributos
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia nacimientoProvincia;
    //Construtores
    public Profesor() {
    }

    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula, Provincia nacimientoProvincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.nacimientoProvincia = nacimientoProvincia;
    }
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * (double) 20 / (double) 100);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNacimientoProvincia() {
        return nacimientoProvincia.getNombre();
    }

    public void setNacimientoProvincia(Provincia nacimientoProvincia) {
        this.nacimientoProvincia = nacimientoProvincia;
    }
    //Metodo toString
    @Override
    public String toString() {
        return String.format("""
                ----- PROFESOR -----
                -Nombre: %s
                -Apellido: %s
                -Sueldo Basico: %.2f
                -Sueldo Total: %.2f
                -Cedula: %s
                -Provincia de Nacimiento: %s
                """,this.getNombre(), this.getApellido(), this.getSueldoBasico(), this.getSueldoTotal(), this.getCedula(), this.getNacimientoProvincia());
    }
}
