package Model.Usuarios.Chofer;

import Model.Persona;

public class Chofer extends Persona {

    private TipoLicencia tipoLicencia;

    public Chofer(int id, int cedula, String nombre, String apellido, String correo, int telefono, String direccion, String fechaNacimiento) {
        super(id, cedula, nombre, apellido, correo, telefono, direccion, fechaNacimiento);
    }


    public TipoLicencia getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
}
