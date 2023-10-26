package org.example.platzi.main;

import org.example.platzi.model.Employee;
import org.example.platzi.repository.EmployeeRepository;
import org.example.platzi.repository.Repository;
import org.example.platzi.util.DataBaseConnection;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {

        try(Connection myConn = DataBaseConnection.getInstance()){
            Repository<Employee> repository = new EmployeeRepository();

            System.out.println(repository.getById(2));

        }
    }
}
