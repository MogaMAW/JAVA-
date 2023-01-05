/* This is a java program that asks for a user's age using the Scanner class and then uses
if statement to make comments on the user's input age 
*/


import java.util.Scanner; // importing the Scanner class.
public class ifStatements { //opening the main function
    public static void main(String[] args) {
        //if statement = performs a block of code if it's condition evaluates to be true

        int age; //declaring an int variable called age
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("How old are you please: "); //requesting  user's input age
            age = scanner.nextInt(); //getting user's input
        }

        // the if function uses the input age to make comparisons and display comments basing on the range of the age 
        if(age==20){
            System.out.println("You are an adult");
        }
        else if(age>1 && age>20){
            System.out.println("You are young");
        }
        else if(age<0){
            System.out.println("You can't have a negative age meaning you are too young, infact not born yet.");
        }
        else{
            System.out.println("You are over 20, bro you are too old.");
        }

    }
    
}
