package Management;

public class Volunteer extends StaffMember{
    private String name;
    private String Id;
    public Volunteer(String name, String Id){
        super(name,Id);
        this.name = name;
        this.Id = Id;
    }
    public void getPostion(){
        System.out.println("i am a Volunteer.");
    }
    public void getCredentials(){
        System.out.println("The name is " + name + "The id is " + Id);
    }
}
