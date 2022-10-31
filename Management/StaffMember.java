package Management;

public class StaffMember {
    private String name;
    private String Id;
    public StaffMember(String name, String Id){
        this.name = name;
        this.Id = Id;
    }
    public void getPostion(){
        System.out.println("i am a staff member");
    }
    public void getCredentials(){
        System.out.println("The name is  " + name + "The id is  " + Id);
    }
    
}
