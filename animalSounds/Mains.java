public class Mains{
    public static void main(String[] args) {
         
        /*
        When using concrete classes to get the sounds
         Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        dog1.getSound();
        cat1.getSound();
         */
        
         // when using the animal super class
        Animal animal1;
        animal1 = new Cat();
        animal1.getSound();
        animal1 =  new Dog();
        animal1.getSound();
}
}