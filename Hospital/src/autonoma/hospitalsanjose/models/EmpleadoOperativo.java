package models;

public class EmpleadoOperativo extends Empleado {
    private String areaTrabajo;

    public EmpleadoOperativo(String nombre, String numeroDocumento, int edad, double salarioBase, String areaTrabajo) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }

    // Getters y Setters
}