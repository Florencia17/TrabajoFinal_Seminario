package ar.edu.unrn.seminario.api;

import ar.edu.unrn.seminario.dto.RolDTO;
import ar.edu.unrn.seminario.dto.UsuarioDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
import ar.edu.unrn.seminario.modelo.Direccion;
import ar.edu.unrn.seminario.modelo.Propietario;

import java.time.LocalDateTime;
import java.util.List;

public interface IApi {


    //VIVIENDA

    void registrarVivienda(Propietario propietario, LocalDateTime fechaRegistro, Direccion direccion);

    ViviendaDTO obtenerVivienda(String direccion);

    void emilinarVivienda(String direccion);

    List<ViviendaDTO> obtenerViviendas(); //recupera todas las viviendas

     //USUARIO
    void registrarUsuario(String username, String password, String email, String nombre, Integer rol);

    UsuarioDTO obtenerUsuario(String username);

    void eliminarUsuario(String username);

    List<UsuarioDTO> obtenerUsuarios(); // recuperar todos los usuarios

    void activarUsuario(String username) ; // recuperar el objeto Usuario, implementar el comportamiento de estado.

    void desactivarUsuario(String username) ; // recuperar el objeto Usuario, implementar el comportamiento de estado.

    //ROLES
    List<RolDTO> obtenerRoles();

    List<RolDTO> obtenerRolesActivos();

    void guardarRol(String nombre, boolean estado); // crear el objeto de dominio “Rol”

    RolDTO obtenerRolPorCodigo(Integer codigo); // recuperar el rol almacenado

    void activarRol(Integer codigo); // recuperar el objeto Rol, implementar el comportamiento de estado.

    void desactivarRol(Integer codigo); // recuperar el objeto Rol, imp



}
