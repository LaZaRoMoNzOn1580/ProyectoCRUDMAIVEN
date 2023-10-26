package org.example.platzi.main;

import java.sql.*;


public class Main {
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/platziblog";
        String user = "root";
        String password = "Lazaro12345@*";

        try(Connection myConn = DriverManager.getConnection(url,user,password);
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
