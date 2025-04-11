package hospital.views;

import hospital.models.Empleado;

//////////// Clase encargada de mostrar datos al usuario //////////////////////
public class HospitalView {

    //////////// Método que muestra la nómina total //////////////////////
    public void mostrarNomina(double total) {
        System.out.println("Nómina total: $" + total);
    }

    //////////// Método que muestra los empleados //////////////////////
    public void mostrarEmpleados(java.util.List<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.getNombre() + " - Salario: $" + e.calcularSalario());
        }
    }

    //////////// Método que muestra mensaje genérico //////////////////////
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
