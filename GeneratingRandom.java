import java.util.Random; //importing the Random class

//The Random class is used to generate any random output such as an Int, double and boolean 

public class GeneratingRandom{
    public static void main(String[] args) {

        Random random = new Random();
        //getting a random integer
        int x =random.nextInt(4);  //the 4 or the bound is the range for the random no. to be selected
        //int x =random.nextInt(4)+1; the +1 outside the bound makes 4 inclusive of the random no.s to be displayed
        
        System.out.println(x);

        //getting a random double 
        double y = random.nextDouble(4);
        System.out.println(y);

        //getting a random boolean..True or False
        boolean z = random.nextBoolean(); // the boolean takes no bound as it returns either true or false
        System.out.println(z);

        //getting a random float
        float a = random.nextFloat(5);
        System.out.println(a);

        //other functions under the Random class include: nextFloat(), nextExponential(), nextGaussian() 
        
         
    }

}