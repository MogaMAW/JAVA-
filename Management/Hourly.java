package Management;

public class Hourly extends Employee {

    private String Id;
    private String name;
    public Hourly(String name, String Id){
        super(name, Id);
        this.Id=Id;
        this.name=name;
    }
    public void getWorkrate(){
        System.out.println("i am part time worker");
    }
    public void getCredentials(){
        System.out.println("The id is " + Id + "\n the name is " + name);
    }
}
