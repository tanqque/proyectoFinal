package models;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String numeroDocumento;
    private int edad;
    private String correoElectronico;
    private String telefono;
    private String estado;
    private List<String> enfermedades;

    public Paciente(String nombre, String numeroDocumento, int edad, String correoElectronico, String telefono) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.estado = "saludable";
        this.enfermedades = new ArrayList<>();
    }

    public void curarEnfermedad