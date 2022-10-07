package InheritenceOne;

public class Lecturers extends People {
    private String Name;
        private String Gender;
        private int Age;
        private String Id;

    public Lecturers(String name, String gender, int age, String id) {
        
        super(name, gender, age); 

        Name= name;
        Gender = gender;
        Age=age;
        Id = id;
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

        public String getId(){
            return Id;
         
        }
    
    
    
}
