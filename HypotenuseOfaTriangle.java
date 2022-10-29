//A java program to find the hypotenuse of a triangle

import java.util.Scanner; // importing the Scanner function 
public class HypotenuseOfaTriangle{

    public static void main(String[] args) {
        double x;  
        double y;
        double z;
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter side x: "); //Requesting for the user's input for side x
        x = scanner.nextDouble(); //using the scanner module to get the input

        System.out.println("Enter side y: ");  //Requesting for the user's input for side y
        y = scanner.nextDouble();  //using the scanner module to get the input
        z= Math.sqrt((x*x)+(y*y));

        //using the Math.sqrt() to get the square root of the hypotenuse
    
    
        System.out.println("The Hypotenuse is : " + z); //displaying of the hypotenuse
    
        scanner.close();    //closing the scanner function. But this is optional
    }
}