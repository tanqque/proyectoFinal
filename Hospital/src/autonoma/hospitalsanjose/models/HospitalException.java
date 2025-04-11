package hospital.models;

//////////// Clase que representa una excepción personalizada para el sistema hospitalario //////////////////////
public class HospitalException extends Exception {

    //////////// Constructor que recibe un mensaje de error personalizado //////////////////////
    public HospitalException(String mensaje) {
        super(mensaje);
    }
}
