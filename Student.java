package InheritenceOne.project;

public class Student {
    private String firstName,lastName;
    
    //constructor
    Student(String FirstName,String LastName){
        firstName=FirstName;
        lastName=LastName;
    }
    public void PrintData(){
        System.out.println(firstName + "  " +lastName);
    }
    public double getPayment(){
        return 0.00;
    }
}
class Undergraduate extends Student{
    private double underwage;
    private double underhour;
    Undergraduate(String FirstName,String LastName,double UnderWage,double UnderHour){
        super( FirstName, LastName);
        underwage=UnderWage;
        underhour=UnderHour;

    }
    
    public double getPayment(){
        return underwage*underhour;
    }
    public void PrintData(){
        super.PrintData();
        System.out.println("The weekly payment is "+ getPayment()*7);
    }
}
class Graduate extends Student{
    private double gradsalary;
    
    Graduate(String FirstName,String LastName,double GradSalary){
        super( FirstName, LastName);
        gradsalary=GradSalary;
      
    }
    
    public double getPayment(){
        return gradsalary;
    }
    public void PrintData(){
        super.PrintData();
        System.out.println("The weekly payment is "+ getPayment()*30);
    }
    // POLYMERPHISM AND LATE BINDING  
public static void main(String[] args) {
    Undergraduate mark = new Undergraduate("Lubega", "Mark", 12.00, 8.0);
    Undergraduate andrew = new Undergraduate("Walusimbi", "Edirisa", 30.00, 12.0);

    Graduate peter = new Graduate("Muwanguzi", "Peter", 2000.0);
    Graduate Mutua = new Graduate("Brian", "Mutua", 5000.0);

Student[] students = new Student[4];
students[0] = mark;
students[1] = andrew;
students[2] = peter;
students[3] = Mutua;

for(int i =0; i<4; i++){
    students[i].PrintData();
}
}
}
