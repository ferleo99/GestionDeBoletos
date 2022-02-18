package Model.Usuarios.Administrador;

import Model.Persona;

public class Administrador extends Persona {

    public Administrador(int id, int cedula, String nombre, String apellido, String correo, int telefono, String direccion, String fechaNacimiento) {
        super(id, cedula, nombre, apellido, correo, telefono, direccion, fechaNacimiento);
    }

}
