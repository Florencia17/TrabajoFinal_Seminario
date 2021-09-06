package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exception.DataEmptyException;
import ar.edu.unrn.seminario.exception.NotNullException;

import java.time.LocalDateTime;


public class Vivienda {

    private Propietario propietario;
    private LocalDateTime fechaRegistro;
    private Direccion direccion;

    public Vivienda(Propietario propietario, LocalDateTime fechaRegistro, Direccion direccion)throws NotNullException {

        if(esDatoNulo(propietario))
            throw new NotNullException("propietario");
        if(esDatoNulo(fechaRegistro))
            throw new NotNullException("Fecha de registro");
        if (esDatoNulo(direccion))
            throw new NotNullException("Direccion");

        this.propietario=propietario;
        this.fechaRegistro= fechaRegistro.now();
        this.direccion=direccion;
    }

    private boolean esDatoVacio(String dato) {
        return dato.equals("");
    }

    private boolean esDatoNulo(Object dato) {
        return dato == null;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    //to string? equals?
}
