package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exception.DataEmptyException;
import ar.edu.unrn.seminario.exception.NotNullException;

public class Propietario {

    private String nombre;
    private String apellido;
    private String dni;
    private int puntosAcumulados;

    public Propietario(String nombre, String apellido, String dni)throws NotNullException, DataEmptyException {

        if(esDatoNulo(nombre))
            throw new NotNullException("nombre");
        if(esDatoNulo(apellido))
            throw new NotNullException("apellido");
        if(esDatoNulo(dni))
            throw new NotNullException("dni");

        if (esDatoVacio(nombre))
            throw new DataEmptyException("nombre");
        if (esDatoVacio(apellido))
            throw new DataEmptyException("apellido");
        if (esDatoVacio(dni))
            throw new DataEmptyException("dni");

        this.nombre= nombre;
        this.apellido= apellido;
        this.dni= dni;
    }
    private boolean esDatoVacio(String dato) {
        return dato.equals("");
    }

    private boolean esDatoNulo(Object dato) {
        return dato == null;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    //to string? equals?
}
