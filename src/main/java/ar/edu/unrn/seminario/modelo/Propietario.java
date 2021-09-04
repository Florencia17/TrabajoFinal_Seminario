package ar.edu.unrn.seminario.modelo;

public class Propietario {

    private String nombre;
    private String apellido;
    private String dni;
    private int puntosAcumulados;

    public Propietario(String nombre, String apellido, String dni){
     //agregar expeciones

        this.nombre= nombre;
        this.apellido= apellido;
        this.dni= dni;
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
