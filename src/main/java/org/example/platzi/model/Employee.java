package org.example.platzi.model;

public class Employee {

    private Integer id;
    private String First_name;
    private String Last_name;
    private String Address;
    private String City;

    public Employee() {
    }

    public Employee(Integer id, String first_name, String last_name, String address, String city) {
        this.id = id;
        First_name = first_name;
        Last_name = last_name;
        Address = address;
        City = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Empleado: " +
                "id:" + id +
                ", First_name:'" + First_name + '\'' +
                ", Last_name:'" + Last_name + '\'' +
                ", Address:'" + Address + '\'' +
                ", City:'" + City + '\'' ;
    }
}
