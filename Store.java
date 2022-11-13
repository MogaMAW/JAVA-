public class Store {
    public static void main(String[] args) {
        //An array = used to store multiple values in a single variable
        String[] cars ={"Camaro","Corvette","Tesla"};

        //arrays in java as well use indices from 0 to represent the first element
        //now inserting a new car Mustang at index 0

        cars[0] = "Mustang";

        System.out.println(cars[0]);
       //data types in an array should be the same or consistent 


       /*
        Method 2 of creating an array: is by specifying the amount of elements needed in the array
        Then  assign each of the elements to the array
        */
        String[] rides = new String[4];
        rides[0] = "Toyota";
        rides[1] = "Mercedez";
        rides[2] = "Benz";
        rides[3] = "Lamboghini";
    
        System.out.println(rides[3]);

        /*
        Now using for loop to iterate through all the elements of the array
        it takes three statements 
        for(int i(index)=0;
        i < rides.length;
        i++ incrementing i){
            printing rides[i]
        }
         */
        for(int i=0; i<rides.length;i++){
            System.out.println(rides[i]);
        }
        //it prints all the rides in order from index 0 to index 4

    }

    
}
