package ar.edu.unrn.seminario.api;

import ar.edu.unrn.seminario.dto.RolDTO;
import ar.edu.unrn.seminario.dto.UsuarioDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
import ar.edu.unrn.seminario.modelo.Direccion;
import ar.edu.unrn.seminario.modelo.Propietario;
import ar.edu.unrn.seminario.modelo.Rol;
import ar.edu.unrn.seminario.modelo.Vivienda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemoryApi implements IApi{

    private List<Vivienda> viviendas= new ArrayList<>();
    private List<Rol> roles= new ArrayList<>();

    //VIVIENDA
    @Override
    public void registrarVivienda(Propietario propietario, LocalDateTime fechaRegistro, Direccion direccion) {
        Vivienda vivienda= new Vivienda(propietario, fechaRegistro, direccion);
        viviendas.add(vivienda);
    }

    @Override
    public ViviendaDTO obtenerVivienda(String direccion) {
        return null;
    }

    @Override
    public void emilinarVivienda(String direccion) {

    }

    @Override
    public List<ViviendaDTO> obtenerViviendas() {
        return null;
    }



    //USUARIOS
    @Override
    public void registrarUsuario(String username, String password, String email, String nombre, Integer rol) {

    }

    @Override
    public UsuarioDTO obtenerUsuario(String username) {
        return null;
    }

    @Override
    public void eliminarUsuario(String username) {

    }

    @Override
    public List<UsuarioDTO> obtenerUsuarios() {
        return null;
    }

    @Override
    public void activarUsuario(String username) {

    }

    @Override
    public void desactivarUsuario(String username) {

    }

    //ROLES
    @Override
    public List<RolDTO> obtenerRoles() {
        List<RolDTO> dtos = new ArrayList<>();
        for (Rol r : roles) {
            dtos.add(new RolDTO(r.getNombre(), r.estaActivo()));
        }
        return dtos;
    }

    @Override
    public List<RolDTO> obtenerRolesActivos() {
        return null;
    }

    @Override
    public void guardarRol(String nombre, boolean estado) {

        Rol rol= new Rol(nombre, estado);
        roles.add(rol);

    }

    @Override
    public RolDTO obtenerRolPorCodigo(Integer codigo) {
        return null;
    }

    @Override
    public void activarRol(Integer codigo) {

    }

    @Override
    public void desactivarRol(Integer codigo) {

    }
}
