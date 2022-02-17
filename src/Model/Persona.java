package Model;

public class Persona {
    private int id;
    private int cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;
    private String direccion;
    private String fechaNacimiento;

    public Persona(int id, int cedula, String nombre, String apellido, String correo, int telefono, String direccion, String fechaNacimiento) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
