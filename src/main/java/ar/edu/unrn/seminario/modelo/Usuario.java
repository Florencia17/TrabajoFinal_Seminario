package ar.edu.unrn.seminario.modelo;

import ar.edu.unrn.seminario.exception.DataEmptyException;
import ar.edu.unrn.seminario.exception.NotNullException;

import java.util.Objects;

public class Usuario {
    private String username;
    private String email;
    private String password;
    private Rol rol;
    private boolean estado;


    public Usuario(String username, String password, String email,
                   Integer rol) throws NotNullException, DataEmptyException {

        if(esDatoNulo(username))
            throw new NotNullException("Nombre de Usuario");
        if(esDatoNulo(password))
            throw new NotNullException("Contrasenia");
        if(esDatoNulo(email))
            throw new NotNullException("Email");
        if(esDatoNulo(rol))
            throw new NotNullException("Rol");

        if(esDatoVacio(username))
            throw new DataEmptyException("Nombre de Usuario");
        if(esDatoVacio(password))
            throw new DataEmptyException("Contrasenia");
        if(esDatoVacio(email))
            throw new DataEmptyException("Email");

        this.username= username;
        this.password=password;
        this.email= email;



    }

    private boolean esDatoVacio(String dato) {
        return dato.equals("");
    }

    private boolean esDatoNulo(Object dato) {
        return dato == null;
    }


    public String getNombreUsuario() {
        return username;
    }

    public String getContrasenia() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Rol getRol() {
        return rol;
    }

    public boolean getEstado() {
        return estado;
    }

    public void activar() {
        if (!estaActivo()) {
            estado=true;
        } else
            throw new RuntimeException("El usuario ya está activo");

    }
    public void desactivar() {
       if(estaActivo()){
           estado=false;
       }else
           throw new RuntimeException("El usuario ya está desactivado");

    }
    public boolean estaActivo() {
        return this.estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + username + '\'' +
                ", email='" + email + '\'' +
                ", contrasenia='" + password + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return estado == usuario.estado && Objects.equals(username, usuario.username) && Objects.equals(email, usuario.email) && Objects.equals(password, usuario.password) && Objects.equals(rol, usuario.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, password, rol, estado);
    }
}
