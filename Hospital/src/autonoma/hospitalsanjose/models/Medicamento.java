package hospital.models;

//////////// Clase abstracta que representa un medicamento genérico //////////////////////
public abstract class Medicamento {

    //////////// Atributos comunes //////////////////////
    protected String nombre;
    protected String descripcion;
    protected double costo;

    //////////// Constructor base para inicializar medicamento //////////////////////
    public Medicamento(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    //////////// Método abstracto que calculará el precio de venta //////////////////////
    public abstract double calcularPrecioVenta();
}
