//a
public class Student{
    private String name;
    private String id;
    private double gpa;
    
    public Student(){
        name = null;
        id = null;
        gpa = 0.0;
    }
    public Student(String name, String id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public double getGpa(){
        return gpa;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setGpa(Double gpa){
        this.gpa = gpa;
    }

    public String toString(){
        return "Name: " + name+  " ID: " +id  +  " GPA: " +gpa;
    }
    public boolean equals(Student anyother){
        return name.equalsIgnoreCase(anyother.name) && gpa == anyother.gpa  && id.equalsIgnoreCase(anyother.id);
    }

}

    

