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

            System.out.println("---Listando------");
            repository.findAll().forEach(System.out::println);

            System.out.println("-----INSERTANDO un empleado-----");
            Employee employee = new Employee();
            employee.setFirst_name("Karen");
            employee.setLast_name("Mendez");
            employee.setAddress("Calle 69");
            employee.setCity("Matanzas");
            repository.save(employee);

            System.out.println("--Nuevo empleado Insertado--");
            repository.findAll().forEach(System.out::println);

        }
    }
}
