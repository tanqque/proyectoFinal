package models;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre;
    private String direccion;
    private String telefono;
    private String logo;
    private double presupuesto;
    private double metaVentasAnual;
    private String fechaFundacion;
    private String estado;
    private List<Empleado> empleados;

    public Hospital(String nombre, String direccion, String telefono, String logo, double presupuesto, double metaVentasAnual, String fechaFundacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = "activo";
        this.empleados = new ArrayList<>();
    }

    public void registrarPatrocinio(double valor) {
        this.presupuesto += valor;
        actualizarEstado();
    }

    public void generarNomina() {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.calcularSalario();
        }
        this.presupuesto -= totalNomina;
        actualizarEstado();
    }

    private void actualizarEstado() {
        if (this.presupuesto < 0) {
            this.estado = "en quiebra";
        }
    }

}

