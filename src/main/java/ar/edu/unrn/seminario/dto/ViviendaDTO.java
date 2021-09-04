package ar.edu.unrn.seminario.dto;

import ar.edu.unrn.seminario.modelo.Direccion;
import ar.edu.unrn.seminario.modelo.Propietario;

public class ViviendaDTO {

    private Propietario propietario;
    private Direccion direccion;

    public ViviendaDTO(Propietario propietario, Direccion direccion){
        super(); //de que?
        this.propietario= propietario;
        this.direccion=direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    //es necesario????????
    public String getCalle(){
        return this.direccion.getCalle();
    }

    public String getNumero(){
        return this.direccion.getNumero();
    }

    public String getBarrio(){
        return this.direccion.getBarrio();
    }

    public String getNombrePropietario(){
        return this.propietario.getNombre();
    }

    public String getApellidoPropietario(){
        return this.propietario.getApellido();
    }

    public String getDniPropietario(){
        return this.propietario.getDni();
    }



}
