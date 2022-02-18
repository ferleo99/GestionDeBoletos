package Model.Storage;

import Model.Usuarios.Administrador.Modulos.AdminViajes;

import java.sql.*;
import java.util.ArrayList;

public class SQLite {

    private Connection connection;

    public Connection open() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:datoslav.s3db");
            if (connection != null) {
                System.out.println("Conexión exitosa!");
                return connection;
            }
        } catch (Exception ex) {
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
            System.out.println("Error en la conexión");
        }
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public ArrayList<AdminViajes> getViajes() {
        ArrayList<AdminViajes> list = new ArrayList<>();
        try {
            Statement statement = open().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM VIAJES");
            while (resultSet.next()) {
                list.add(new AdminViajes(resultSet.getInt("id"), resultSet.getDate("FechaDate"), resultSet.getTimestamp("Horario"), resultSet.getInt("ruta_Id_Ruta")));
            }

            return list;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        close();
        return list;
    }

    public void deleteViaje(int id) {
        try {
            Statement statement = open().createStatement();
            statement.executeQuery("DELETE * FROM VIAJES WHERE id=" + id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        close();
    }


}
