public class MonsterTruck extends Car {
    public void m1(){
        System.out.println("monster 1");
    }
    public void m2(){
        super.m1();
    }
    public String toString(){
        return "monster " + super.toString() + super.toString();
    }
}
    


