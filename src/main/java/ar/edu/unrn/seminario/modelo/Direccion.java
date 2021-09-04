package ar.edu.unrn.seminario.modelo;

public class Direccion {

    private String calle;
    private String numero;
    private String barrio;

    //latitud y longitud?

    public Direccion(String calle, String numero, String barrio){
        this.calle=calle;
        this.numero=numero;
        this.barrio=barrio;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getBarrio() {
        return barrio;
    }

    //to string? equals?
}
