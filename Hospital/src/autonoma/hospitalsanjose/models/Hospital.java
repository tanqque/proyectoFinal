package hospital.models;

import java.util.ArrayList;
import java.util.List;

//////////// Clase que representa al Hospital San José St. Bonaventure //////////////////////
public class Hospital {

    //////////// Atributos generales del hospital //////////////////////
    private String nombre;
    private String direccion;
    private String telefono;
    private double presupuesto;
    private boolean estado; // true = activo, false = en quiebra

    //////////// Composición: listas dinámicas de empleados y pacientes //////////////////////
    private List<Empleado> empleados;
    private List<Paciente> pacientes;

    //////////// Constructor que inicializa el hospital con listas vacías //////////////////////
    public Hospital(String nombre, String direccion, String telefono, double presupuesto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.presupuesto = presupuesto;
        this.estado = true;
        this.empleados = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    //////////// Método para agregar un empleado //////////////////////
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    //////////// Método para agregar un paciente //////////////////////
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    //////////// Método para calcular y mostrar la nómina total //////////////////////
    public double generarNomina() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario(); // Polimorfismo
        }
        return total;
    }

    //////////// Método para actualizar el estado financiero del hospital //////////////////////
    public void actualizarEstado() {
        estado = presupuesto > 0;
    }

    //////////// Método para disminuir presupuesto //////////////////////
    public void disminuirPresupuesto(double cantidad) throws HospitalException {
        if (cantidad > presupuesto) {
            throw new HospitalException("Fondos insuficientes");
        }
        presupuesto -= cantidad;
    }

    //////////// Getters para vista //////////////////////
    public String getNombre() { return nombre; }
    public double getPresupuesto() { return presupuesto; }
    public boolean isEstado() { return estado; }
    public List<Empleado> getEmpleados() { return empleados; }
}
