import models.*;
import controllers.HospitalController;

import java.util.ArrayList;

public class estructuraHospital {
    public static void main(String[] args) {
        // Crear el hospital
        Hospital hospital = new Hospital("Hospital San José St. Bonaventure", "Calle 123", "123456789", "logo.png", 1000000, 5000000, "01-01-2000");

        // Crear el controlador
        HospitalController controller = new HospitalController(hospital);

        // Agregar empleados
        EmpleadoSalud empleadoSalud = new EmpleadoSalud("Dr. Juan", "123456", 35, 3000, "Cardiología", 40);
        EmpleadoOperativo empleadoOperativo = new EmpleadoOperativo("Ana Pérez", "654321", 28, 2000, "Mantenimiento");

        controller.agregarEmpleado(empleadoSalud);
        controller.agregarEmpleado(empleadoOperativo);

        // Mostrar empleados
        controller.mostrarEmpleados();

        // Generar nómina
        controller.generarNomina();

        // Crear y mostrar paciente
        Paciente paciente = new Paciente("Carlos López", "789012", 45, "carlos@example.com", "987654321");
        controller.mostrarPaciente(paciente);
    }
}