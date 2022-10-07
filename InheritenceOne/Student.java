package InheritenceOne;

public class Student extends People {
    private String Gender;
    private String Name;
    private int Age;
    private String RegNo;
    private String AccessNo;  
    
    
    public Student(String gender, String name, int age, String regno, String accessno){
        super(name,gender,age);
        Gender = gender;
        Name=name;
        Age =age;
        RegNo=regno;
        AccessNo=accessno;
    }


    // public String getName(){
    //     return Name;
    // }
    // public String getGender(){
    //     return Gender;
    // }
    // public int getAge(){
    //     return Age;
    // }

     public String getRegNo(){
        return RegNo;
    }
    public String getAccessNo(){
        return AccessNo;
    }

}


