package ejecutor;

public class Automotor {
    //Atributos
    private String cedulaDueno;
    private Fabricante marcaAutomotor;
    private String anoFabricacion;
    private double valorAutomotor;
    private double valorMatriculaAutomotor;
    //Constructores
    public Automotor() {
    }

    public Automotor(String cedulaDueno, Fabricante marcaAutomotor, String anoFabricacion, double valorAutomotor) {
        this.cedulaDueno = cedulaDueno;
        this.marcaAutomotor = marcaAutomotor;
        this.anoFabricacion = anoFabricacion;
        this.valorAutomotor = valorAutomotor;
    }
    //Metodos

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public String getMarcaAutomotor() {
        return marcaAutomotor.getNombre();
    }

    public void setMarcaAutomotor(Fabricante marcaAutomotor) {
        this.marcaAutomotor = marcaAutomotor;
    }

    public String getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(String anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public double getValorAutomotor() {
        return valorAutomotor;
    }

    public void setValorAutomotor(double valorAutomotor) {
        this.valorAutomotor = valorAutomotor;
    }

    public double getValorMatriculaAutomotor() {
        return valorMatriculaAutomotor;
    }

    public void calcularValorMatriculaAutomotor() {
        this.valorMatriculaAutomotor = ((this.valorAutomotor * 0.002) / (double) 100) * (2023 - Integer.parseInt(this.anoFabricacion));
    }
    //Metodo toString

    @Override
    public String toString() {
        return String.format("""
                ----- AUTOMOTOR -----
                -Cedula del Dueño: %s
                -Marca Automotor: %s
                -Año de Fabricacion: %s
                -Valor del Automotor: %.2f
                -Valor de Matricula: %.2f
                """,this.getCedulaDueno(), this.getMarcaAutomotor(), this.getAnoFabricacion(), this.getValorAutomotor(), this.getValorMatriculaAutomotor());
    }
}
