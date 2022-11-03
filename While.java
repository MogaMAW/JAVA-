
/*
 A java program to ask  a user to type their name the program does not terminate until a string probably name is typed
 The  program keeps prompting the user to enter their name using isBlank() to check if  the user enters a name or the program continues with the loop 
 */
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        //while loop = executes a block of code as long as it's condition remains true

        try (Scanner scanner = new Scanner(System.in)) {
            String name = "";

            while(name.isBlank()){ //the isBlank() checks to see if the user enters a name other than that, it will continue looping until a string or name is entered
                System.out.print("Enter your name:");// here a print statement is used instead of println
                name = scanner.nextLine(); 

            }
            System.out.println("Hello "+ name); // prints out only when the program is false that's when the user enters the name 
        }
    }

    
}
