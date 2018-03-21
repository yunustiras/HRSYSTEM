package application.model;

public class Project {
    private int id;
    private String name;
    private String description;
    private int managerId;
    private boolean status;

    public Project(){
        this(0,"NONE","NONE",0,false);
    }

    public Project(int id,String name,String description,int managerId,boolean status){
        this.id = id;
        this.name = name;
        this.description = description;
        this.managerId = managerId;
        this.status = status;
    }

}
