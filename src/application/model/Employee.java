package application.model;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private float salary;
    private int projectId;
    private int employeeType;

    public Employee(){
        this(0,"NONE","NONE",0.0f,0,0);
    }

    public Employee(int id, String name, String surname, float salary, int projectId, int employeeType){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.projectId = projectId;
        this.employeeType = employeeType;
    }
}
