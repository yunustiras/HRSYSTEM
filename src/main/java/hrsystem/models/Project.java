package hrsystem.models;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private int id;
    private String title;
    private String description;
    private Employee manager;
    private boolean status;
    private Date startTime;
    private Date finishTime;
    private ArrayList<Employee> employees;
    private ArrayList<Restriction> restrictions;

    public Project(
            int id,
            String title,
            String description,
            Employee manager,
            boolean status,
            Date startTime,
            Date finishTime){
        this.id = id;
        this.title = title;
        this.description = description;
        this.manager = manager;
        this.status = status;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.employees = new ArrayList<Employee>();
        this.restrictions = new ArrayList<Restriction>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Restriction> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(ArrayList<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}
