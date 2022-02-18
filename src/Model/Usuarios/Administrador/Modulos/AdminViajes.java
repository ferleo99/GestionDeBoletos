package Model.Usuarios.Administrador.Modulos;

import java.sql.Timestamp;
import java.util.Date;

public class AdminViajes {
    private int id;
    private Date fechaViaje;
    private Timestamp timestamp;
    private int idRuta;

    public AdminViajes(int id, Date fechaViaje, Timestamp timestamp, int idRuta) {
        this.id = id;
        this.fechaViaje = fechaViaje;
        this.timestamp = timestamp;
        this.idRuta = idRuta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }
}
