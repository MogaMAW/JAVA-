package InheritenceOne;
public class People {
    private String name;
    private String gender;
    private int age;

    public People(String Name, String Gender,int Age ){
        name = Name;
        gender= Gender;
        age = Age;

    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}