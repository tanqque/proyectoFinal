package controllers;

import models.Hospital;
import models.Empleado;
import models.Paciente;
import views.HospitalView;

import java.util.List;

public class HospitalController {
    private Hospital hospital;
    private HospitalView view;

    public HospitalController(Hospital hospital) {
        this.hospital = hospital;
        this.view = new HospitalView();
    }

    public void agregarEmpleado(Empleado empleado) {
        hospital.getEmpleados().add(empleado);
    }

    public void generarNomina() {
        hospital.generarNomina();
        view.mostrarEstadoHospital(hospital);
    }

    public void mostrarEmpleados() {
        view.mostrarEmpleados(hospital.getEmpleados());
    }

    public void mostrarPaciente(Paciente paciente) {
        view.mostrarPaciente(paciente);
    }
}