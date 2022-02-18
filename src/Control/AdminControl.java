package Control;

import Control.Administrador.*;
import Model.Usuarios.Administrador.Modulos.AdminUsuarios;

import java.util.ArrayList;

public class AdminControl {

    private BusesManager busesManager;
    private CooperativasManager cooperativasManager;
    private UsuariosManager usuariosManager;
    private ViajesManager viajesManager;
    private ReportesManager reportesManager;
    private static AdminControl instance;

    private AdminControl() {
        this.busesManager = new BusesManager();
        this.cooperativasManager = new CooperativasManager();
        this.usuariosManager = new UsuariosManager();
        this.viajesManager = new ViajesManager();
        this.reportesManager = new ReportesManager();
    }

    public AdminControl getInstance() {
        if (instance == null) {
            instance = new AdminControl();
        }
        return instance;
    }

}
