package hospital.models;

//////////// Clase que representa a un empleado del área de la salud //////////////////////
public class EmpleadoSalud extends Empleado {

    //////////// Atributos específicos del personal de salud //////////////////////
    private String especialidad;
    private int horasTrabajadas;

    //////////// Constructor que inicializa un empleado de salud con sus datos específicos //////////////////////
    public EmpleadoSalud(String nombre, String numeroDocumento, int edad, double salarioBase, String especialidad, int horasTrabajadas) {
        super(nombre, numeroDocumento, edad, salarioBase);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    //////////// Implementación del cálculo de salario basado en horas trabajadas //////////////////////
    @Override
    public double calcularSalario() {
        return salarioBase + (horasTrabajadas * 5000);
    }
}
