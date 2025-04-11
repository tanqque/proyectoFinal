package views;

import models.Hospital;
import models.Empleado;
import models.Paciente;

import java.util.List;

public class hospitalviews {
    public void mostrarEstadoHospital(Hospital hospital) {
        System.out.println("Estado del Hospital: " + hospital.getEstado());
        System.out.println("Presupuesto: " + hospital.getPresupuesto());
    }

    public void mostrarEmpleados(List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + ", Salario: " + empleado.calcularSalario());
        }
    }

    public void mostrarPaciente(Paciente paciente) {
        System.out.println("Paciente: " + paciente.getNombre() + ", Estado: " + paciente.getEstado());
    }
}