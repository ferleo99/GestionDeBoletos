package Model.Usuarios.Administrador.Modulos;

public class AdminBuses {

    private int id;
    private String placaBus;
    private int numeroAsientos;

    public AdminBuses(int id, String placaBus, int numeroAsientos) {
        this.id = id;
        this.placaBus = placaBus;
        this.numeroAsientos = numeroAsientos;
    }

    public int getId() {
        return id;
    }

    public String getPlacaBus() {
        return placaBus;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }
}
