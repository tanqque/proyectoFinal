import hospital.controllers.HospitalController;
import hospital.models.*;
import hospital.views.HospitalView;

//////////// Clase principal que inicia la aplicación //////////////////////
public class Main {

    public static void main(String[] args) {
        //////////// Crear hospital y vista //////////////////////
        Hospital hospital = new Hospital("San José St. Bonaventure", "Calle 123", "555-1234", 10000000);
        HospitalView vista = new HospitalView();
        HospitalController controller = new HospitalController(hospital, vista);

        //////////// Crear y agregar empleados //////////////////////
        hospital.agregarEmpleado(new EmpleadoSalud("Dr. House", "1001", 50, 3000000, "Diagnóstico", 50));
        hospital.agregarEmpleado(new EmpleadoOperativo("Wilson", "1002", 45, 1500000, "Mantenimiento"));

        //////////// Ejecutar lógica de negocio //////////////////////
        controller.ejecutar();
    }
}
