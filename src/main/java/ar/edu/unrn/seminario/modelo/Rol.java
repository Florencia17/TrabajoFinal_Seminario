package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exception.DataEmptyException;
import ar.edu.unrn.seminario.exception.NotNullException;

import java.util.Objects;

public class Rol {

    private Integer codigo;
    private  String nombre;
    private boolean estado;

    public Rol(Integer codigo, String nombre)throws NotNullException, DataEmptyException {

        if(esDatoNulo(codigo))
            throw new NotNullException("codigo");
        if(esDatoNulo(nombre))
            throw new NotNullException("nombre");
        if(esDatoVacio(nombre))
            throw new DataEmptyException("nombre");
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public Rol(String nombre, boolean estado)throws NotNullException,DataEmptyException{
        if(esDatoNulo(nombre))
            throw new NotNullException("nombre");
        if(esDatoNulo(estado))
            throw new NotNullException("estado");
        if(esDatoVacio(nombre))
            throw new DataEmptyException("nombre");

        this.nombre=nombre;
        this.estado= estado;
    }

    private boolean esDatoVacio(String dato) {
        return dato.equals("");
    }

    private boolean esDatoNulo(Object dato) {
        return dato == null;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void activar() {
        //agregar excepcion
        estado=true;
    }
    public void desactivar() {
        //agregar excepcion
        estado=false;
    }
    public boolean estaActivo() {
        return this.estado;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return estado == rol.estado && Objects.equals(codigo, rol.codigo) && Objects.equals(nombre, rol.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, estado);
    }
}
