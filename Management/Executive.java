package Management;

public class Executive extends Employee {
    private String Id;
    private String name;

    public Executive( String Id,String name){
        super(name, Id);
        this.Id = Id;
        this.name = name;
    }
    public void getWorkrate(){
        System.out.println("i am an Executive");
    }
    public void getCredentials(){
        System.out.println("The id is " + Id + "\n the name is " + name);
    }
    
    
}
