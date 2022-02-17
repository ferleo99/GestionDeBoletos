package Model.Usuarios;

import Model.Persona;

public class Vendedor extends Persona {
    public Vendedor(int id, int cedula, String nombre, String apellido, String correo, int telefono, String direccion, String fechaNacimiento) {
        super(id, cedula, nombre, apellido, correo, telefono, direccion, fechaNacimiento);
    }
}
