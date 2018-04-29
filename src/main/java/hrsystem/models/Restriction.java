package hrsystem.models;

public class Restriction {
    private int id;
    private EmployeeType employeeType;
    private int min;
    private int max;

    public Restriction(int id, EmployeeType employeeType, int min, int max) {
        this.id = id;
        this.employeeType = employeeType;
        this.min = min;
        this.max = max;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
