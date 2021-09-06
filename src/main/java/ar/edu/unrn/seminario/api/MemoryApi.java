package ar.edu.unrn.seminario.api;

import ar.edu.unrn.seminario.dto.RolDTO;
import ar.edu.unrn.seminario.dto.UsuarioDTO;
import ar.edu.unrn.seminario.dto.ViviendaDTO;
import ar.edu.unrn.seminario.exception.DataEmptyException;
import ar.edu.unrn.seminario.exception.NotNullException;
import ar.edu.unrn.seminario.modelo.*;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.*;

public class MemoryApi implements IApi{

   // private List<Vivienda> viviendas= new ArrayList<>();
   private Set<Vivienda> viviendas = new HashSet();
    private Map<Integer, Rol> roles = new HashMap<>();
    private List<Usuario> usuarios= new ArrayList<>();

    //VIVIENDA
    @Override
    public void registrarVivienda(Propietario propietario, LocalDateTime fechaRegistro, Direccion direccion) throws NotNullException{
        Vivienda vivienda= new Vivienda(propietario, fechaRegistro, direccion);
        this.viviendas.add(vivienda);
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
        List<ViviendaDTO> dtos = new ArrayList<>();
        for (Vivienda v : this.viviendas) {
            dtos.add(new ViviendaDTO(v.getPropietario(), v.getDireccion()));
        }
        return dtos;
    }



    //USUARIOS
   /* @Override
    public void registrarUsuario(String username, String password, String email, Integer rol) throws NotNullException, DataEmptyException {
        Usuario usuario= new Usuario(username,password,email,rol);
        usuarios.add(usuario);

    }
*/
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
 /*   @Override
    public List<RolDTO> obtenerRoles() {
        List<RolDTO> dtos = new ArrayList<>();
        for (Rol r : roles) {
            dtos.add(new RolDTO(r.getNombre(), r.estaActivo()));
        }
        return dtos;
    }
*/
    @Override
    public List<RolDTO> obtenerRolesActivos() {
        return null;
    }

   /* @Override
    public void guardarRol(Integer codigo, String nombre, boolean estado) throws NotNullException,DataEmptyException{

        Rol rol= new Rol(codigo, nombre);
        this.roles.put(codigo, rol);

    }
*/
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
