package Management;

/**
 * Employee
 */
public class Employee extends StaffMember {
    private String name;
    private String Id;
    public Employee(String name, String Id){
        super(name, Id);
        this.name = name;
        this.Id = Id;
    }
    public void getPostion(){
        System.out.println("i am an employee");
    }
    public void getWorkrate(){
        System.out.println("i am a full time worker");
    }
    public void getCredentials(){
        System.out.println("The name is  " + name + "The id is  " + Id);
    }
}