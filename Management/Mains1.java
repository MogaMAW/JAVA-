package Management;

public class Mains1 {
    public static void main(String[] args) {
        StaffMember staff1;
        staff1 =  new Volunteer("Peter", "V324234");
        staff1.getPostion();
        staff1.getCredentials();
        staff1 = new Employee("Paul", "E7634646");
        staff1.getPostion();
        staff1.getCredentials();

        Employee worker;
        worker = new Executive("EE45353","Charles ");
        worker.getWorkrate();
        worker.getCredentials();
        worker = new Hourly("Muganga","EH643346");
        worker.getWorkrate();
        worker.getCredentials();
    }
}
