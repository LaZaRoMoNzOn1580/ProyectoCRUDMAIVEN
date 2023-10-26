package org.example.platzi.repository;

import org.example.platzi.model.Employee;
import org.example.platzi.util.DataBaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmployeeRepository implements Repository<Employee> {
    private Connection getConnection() throws SQLException {
        return DataBaseConnection.getInstance();
    }
    @Override
    public List<Employee> findAll() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        try(Statement myStam = getConnection().createStatement()){
            ResultSet myRes = myStam.executeQuery("SELECT * FROM people");
            while (myRes.next()){
               employees.add(createEmployee(myRes));
            }

        }
        return employees;
    }

    @Override
    public Employee getById(Integer id) throws SQLException {
        Employee employee = null;
        try(PreparedStatement myStamt = getConnection().prepareStatement("SELECT * FROM people WHERE person_id ?")){
            myStamt.setInt(1,id);
            try(ResultSet myRes = myStamt.executeQuery()) {
                if (myRes.next()) {
                    employee = createEmployee(myRes);
                }
            }
        }
        return employee;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(Integer id) {

    }

    private Employee createEmployee(ResultSet myRest) throws SQLException {
        Employee e = new Employee();
        e.setId(myRest.getInt("person_id"));
        e.setFirst_name(myRest.getString("frist_name"));
        e.setLast_name(myRest.getString("last_name"));
        e.setAddress(myRest.getString("address"));
        e.setCity(myRest.getString("city"));
        return e;
    }
}
