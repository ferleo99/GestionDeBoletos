package Control.Administrador;

import Model.Storage.SQLite;
import Model.Usuarios.Administrador.Modulos.AdminViajes;

import java.util.HashMap;

public class ViajesManager {

    SQLite sqLite = new SQLite();
    public static HashMap<Integer, AdminViajes> viajesHashMap = new HashMap<>();

    /*public void insertViajesTable() {
        for (AdminViajes adminViajes : sqLite.getViajes()) {
            if (adminViajes != null) {
                viajesHashMap.put(adminViajes.getId(), adminViajes);
            }
        }
    }

    public AdminViajes getViaje(int id) {
        return viajesHashMap.getOrDefault(id, null);
    }

    public void removeViaje(int id) {
        viajesHashMap.remove(id);
        sqLite.deleteViaje(id);
    }*/
}
