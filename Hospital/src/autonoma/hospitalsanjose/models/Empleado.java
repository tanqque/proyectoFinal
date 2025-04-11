package hospital.models;

//////////// Clase abstracta que representa a un empleado genérico //////////////////////
public abstract class Empleado {

    //////////// Atributos comunes para todos los empleados //////////////////////
    protected String nombre;
    protected String numeroDocumento;
    protected int edad;
    protected double salarioBase;

    //////////// Constructor que inicializa los atributos del empleado //////////////////////
    public Empleado(String nombre, String numeroDocumento, int edad, double salarioBase) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    //////////// Método abstracto que debe implementar cada tipo de empleado para calcular su salario //////////////////////
    public abstract double calcularSalario();

    //////////// Getters //////////////////////
    public String getNombre() { return nombre; }
}
