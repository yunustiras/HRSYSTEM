package hrsystem.models;

import java.sql.Date;

public class Employee {
    private Integer id;
    private String firstName;
    private String surname;
    private Integer ssn;
    private Boolean isActive;
    private Date jobStartDate;
    private AccountingSoftware accountingSoftwareType;
    private EmployeeType employeeType;
    private SalaryDetails salary;
    private Shift[] shifts;
    private TrainingInfo[] trainings;
    private OffDays[] offDays;

    public Employee() {}

    public Employee(Integer id, String firstName, String surname, Integer ssn, Boolean isActive, Date jobStartDate, AccountingSoftware accountingSoftwareType, EmployeeType employeeType, SalaryDetails salary, Shift[] shifts, TrainingInfo[] trainings, OffDays[] offDays) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.ssn = ssn;
        this.isActive = isActive;
        this.jobStartDate = jobStartDate;
        this.accountingSoftwareType = accountingSoftwareType;
        this.employeeType = employeeType;
        this.salary = salary;
        this.shifts = shifts;
        this.trainings = trainings;
        this.offDays = offDays;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(Date jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public AccountingSoftware getAccountingSoftwareType() {
        return accountingSoftwareType;
    }

    public void setAccountingSoftwareType(AccountingSoftware accountingSoftwareType) {
        this.accountingSoftwareType = accountingSoftwareType;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public SalaryDetails getSalary() {
        return salary;
    }

    public void setSalary(SalaryDetails salary) {
        this.salary = salary;
    }

    public Shift[] getShifts() {
        return shifts;
    }

    public void setShifts(Shift[] shifts) {
        this.shifts = shifts;
    }

    public TrainingInfo[] getTrainings() {
        return trainings;
    }

    public void setTrainings(TrainingInfo[] trainings) {
        this.trainings = trainings;
    }

    public OffDays[] getOffDays() {
        return offDays;
    }

    public void setOffDays(OffDays[] offDays) {
        this.offDays = offDays;
    }
}
