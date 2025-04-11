package models;

public class Medicamento {
    protected String nombre;
    protected String descripcion;
    protected double costo;
    protected double precioVenta;

    public Medicamento(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = calcularPrecioVenta();
    }

    public double calcularPrecioVenta() {
        return costo * 1.1; // Genérico por defecto
    }

    // Getters y Setters
}
