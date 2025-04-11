package hospital.controllers;

import hospital.models.*;
import hospital.views.HospitalView;

//////////// Clase que controla la lógica entre vista y modelo //////////////////////
public class HospitalController {

    private Hospital modelo;
    private HospitalView vista;

    //////////// Constructor del controlador con inyección de dependencias //////////////////////
    public HospitalController(Hospital modelo, HospitalView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    //////////// Método para mostrar el estado del hospital y sus empleados //////////////////////
    public void ejecutar() {
        double nomina = modelo.generarNomina();
        vista.mostrarNomina(nomina);
        vista.mostrarEmpleados(modelo.getEmpleados());
    }
}
