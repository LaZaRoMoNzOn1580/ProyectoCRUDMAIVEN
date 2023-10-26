package org.example.platzi.main;

import org.example.platzi.util.DataBaseConnection;

import java.sql.*;


public class Main {
    public static void main(String[] args){

        try(Connection myConn = DataBaseConnection.getInstance();
            Statement myStamt = myConn.createStatement();
            ResultSet resultSet = myStamt.executeQuery("SELECT * FROM people");){

            while (resultSet.next()){
                System.out.println(resultSet.getString("frist_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Algo Salio Mal");
        }

    }
}
