package hospital.models;

//////////// Clase que representa un medicamento de marca //////////////////////
public class MedicamentoMarca extends Medicamento {

    //////////// Atributo adicional: fabricante //////////////////////
    private String fabricante;

    //////////// Constructor con fabricante //////////////////////
    public MedicamentoMarca(String nombre, String descripcion, double costo, String fabricante) {
        super(nombre, descripcion, costo);
        this.fabricante = fabricante;
    }

    //////////// Precio de venta con 40% de margen sobre el costo //////////////////////
    @Override
    public double calcularPrecioVenta() {
        return costo * 1.4;
    }
}
