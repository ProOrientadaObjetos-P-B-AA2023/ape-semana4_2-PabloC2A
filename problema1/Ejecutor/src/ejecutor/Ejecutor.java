package ejecutor;

class Estudiante {
    //Atributos
    private String nombre;
    private double calificacion_materia1;
    private double calificacion_materia2;
    private double calificacion_materia3;
    private double promedio;
    private Universidad universidad;
    //Constructores
    public Estudiante() {
    }
    public Estudiante(String nombre, double calificacion_materia1, double calificacion_materia2, double calificacion_materia3, Universidad universidad) {
        this.nombre = nombre;
        this.calificacion_materia1 = calificacion_materia1;
        this.calificacion_materia2 = calificacion_materia2;
        this.calificacion_materia3 = calificacion_materia3;
        this.universidad = universidad;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion_materia1() {
        return calificacion_materia1;
    }

    public void setCalificacion_materia1(double calificacion_materia1) {
        this.calificacion_materia1 = calificacion_materia1;
    }

    public double getCalificacion_materia2() {
        return calificacion_materia2;
    }

    public void setCalificacion_materia2(double calificacion_materia2) {
        this.calificacion_materia2 = calificacion_materia2;
    }

    public double getCalificacion_materia3() {
        return calificacion_materia3;
    }

    public void setCalificacion_materia3(double calificacion_materia3) {
        this.calificacion_materia3 = calificacion_materia3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {
        this.promedio = this.calificacion_materia1 + this.calificacion_materia2 + this.calificacion_materia3 / 3;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", calificacion_materia1=" + calificacion_materia1 + ", calificacion_materia2=" + calificacion_materia2 + ", calificacion_materia3=" + calificacion_materia3 + ", promedio=" + promedio + ", universidad=" + universidad + '}';
    }
    
}

class Universidad {
    //Atributos
    private String nombre;
    private String direccion;
    //Constructores
    public Universidad() {
    }

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //Metodo toString
    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
}

public class Ejecutor {
    public static void main(String[] args) {
        Universidad universidad1 = new Universidad("UTPL","San Cayetano");
        Estudiante estudiante1 = new Estudiante("Pablo",6,8,10,universidad1);
        estudiante1.calcularPromedio();
        System.out.println(estudiante1);
    }
    
}
