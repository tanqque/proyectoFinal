package models;

public abstract class Empleado {
    protected String nombre;
    protected String numeroDocumento;
    protected int edad;
    protected double salarioBase;

    public Empleado(String nombre, String numeroDocumento, int edad, double salarioBase) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    // Getters y Setters
}