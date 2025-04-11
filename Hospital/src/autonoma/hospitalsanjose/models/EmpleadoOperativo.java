package hospital.models;

//////////// Clase que representa a un empleado operativo (limpieza, mantenimiento, etc.) //////////////////////
public class EmpleadoOperativo extends Empleado {

    //////////// Atributo que indica el área en la que trabaja el empleado operativo //////////////////////
    private String areaTrabajo;

    //////////// Constructor que inicializa un empleado operativo con su información //////////////////////
    public EmpleadoOperativo(String nombre, String numeroDocumento, int edad, double salarioBase, String areaTrabajo) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }

    //////////// Implementación del cálculo de salario con un aumento del 10% sobre el salario base //////////////////////
    @Override
    public double calcularSalario() {
        return salarioBase * 1.1;
    }
}
