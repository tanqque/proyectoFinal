package hospital.models;

//////////// Clase que representa a un paciente registrado en el hospital //////////////////////
public class Paciente {

    //////////// Atributos personales del paciente //////////////////////
    private String nombre;
    private String numeroDocumento;
    private int edad;
    private String telefono;

    //////////// Constructor que inicializa un nuevo paciente con su información básica //////////////////////
    public Paciente(String nombre, String numeroDocumento, int edad, String telefono) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.telefono = telefono;
    }
}
