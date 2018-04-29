package hrsystem.models;

import hrsystem.models.EmployeeType;

public class Employee {
    private int id;
    private String firstName;
    private String surname;
    private int ssn;
    private float salary;
    private EmployeeType employeeType;

    public Employee(int id, String firstName, String surname, int ssn, float salary, EmployeeType employeeType) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.ssn = ssn;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}
