package org.example.platzi.main.module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    private String url;
    private String user;
    private String password;
    Connection myConn = null;

    public Conector(String Url, String User, String Password){
        this.url = Url;
        this.user = User;
        this.password = Password;
    }

    public void CrearConexion(){

        try {
            myConn = DriverManager.getConnection(this.url,this.user,this.password);
            System.out.println("La Conexion se Ha Realizado Exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ha ocurrido un problema a la hora de realizar la Conexion");
        }

    }
}
