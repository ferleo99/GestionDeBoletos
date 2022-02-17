package Model.Usuarios.Pasajero;

import Model.Persona;

public class Pasajero extends Persona {

    private EstadoPasajero estadoUsuario;

    public Pasajero(int id, int cedula, String nombre, String apellido, String correo, int telefono, String direccion, String fechaNacimiento) {
        super(id, cedula, nombre, apellido, correo, telefono, direccion, fechaNacimiento);
    }


    public EstadoPasajero getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoPasajero estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

}
