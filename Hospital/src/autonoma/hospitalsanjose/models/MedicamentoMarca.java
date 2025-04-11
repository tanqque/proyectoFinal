package models;

public class MedicamentoMarca extends Medicamento {
    private String fabricante;

    public MedicamentoMarca(String nombre, String descripcion, double costo, String fabricante) {
        super(nombre, descripcion, costo);
        this.fabricante = fabricante;
    }

    @Override
    public double calcularPrecioVenta() {
        return costo * 1.25; // Medicamento de marca
    }

    // Getters y Setters
}