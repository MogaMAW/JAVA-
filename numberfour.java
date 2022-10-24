// Plain Janitor class with her duties
public class Janitor {
    
    public int getHours() {
        return 80;
    }
    public double getSalary() {
        return 30000.0;
    }
    public int getVacationDays() {
        return 5;
    } 
    public void clean() {
        System.out.println("Workin' for the man.");
    }
}

// modified program to that used the super keyword to connect with the Employee class.
public class Janitor extends Employee {
    public int getHours() {
        return super.getHours() * 2;
    }
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
    public String getVacationForm() {
        return super.getVacationForm();
    }
    public void clean() {
        System.out.println("Workin' forthe man.");
    }
}
