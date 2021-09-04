package ar.edu.unrn.seminario.modelo;

import java.time.LocalDateTime;


public class Vivienda {

    private Propietario propietario;
    private LocalDateTime fechaRegistro;
    private Direccion direccion;

    public Vivienda(Propietario propietario, LocalDateTime fechaRegistro, Direccion direccion){
        //agregar excepciones
        this.propietario=propietario;
        this.fechaRegistro= fechaRegistro.now();
        this.direccion=direccion;
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
