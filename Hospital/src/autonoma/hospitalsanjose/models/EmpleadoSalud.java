package models;

public class EmpleadoSalud extends Empleado {
    private String especialidad;
    private int horasTrabajadas;

    public EmpleadoSalud(String nombre, String numeroDocumento, int edad, double salarioBase, String especialidad, int horasTrabajadas) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return (salarioBase * 0.012) * horasTrabajadas;
    }

    // Getters y Setters
}