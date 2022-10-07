package InheritenceOne;

public class mains {
    public static void main(String[] args) {
        People peopleone = new People("Muganga Charles", "Male",12);
        Student stdnt1 = new Student("Male", "John Bosco", 10, "S2384638/89", "B234545");
        Lecturers lectr1 = new Lecturers("Mr. Ssejjuko Ronald", "Male", 32, "MainLec");

        System.out.println("Student name is"+stdnt1.getName());
        System.out.println("Lecturer Age is"+lectr1.getAge());

    }

    
}
