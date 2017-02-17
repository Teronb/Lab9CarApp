import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by teronb1005 on 2/16/2017.
 */
public class CarApp {
    //write a main to instantiate and test the Car class
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        //Welcome User to Dealership
          System.out.println("Hello, Welcome to Briggs Motor City ");

        //find out how many we need
          System.out.println("How many cars would you like to know about? ");
        int numCars = scan.nextInt();

        //create the ArrayList (empty for now)
          ArrayList <Car> carList = new ArrayList<Car>();

        //make and store the required # of users
          for (int i = 0; i < numCars; i++) {
              //get the info
              System.out.print("What is the car's make? ");
              String make = scan.next();

              System.out.print("What is the car's model? ");
              String model = scan.next();

              System.out.print("What year is the car? ");
              int year = scan.nextInt();

              System.out.print("What the price of the car? ");
              double price = scan.nextDouble();

              /*System.out.print("What portion of the bootcamp " +
                      "has the user completed? ");
              double complete = scan.nextDouble();*/

              //create a new instance
              Car c = new Car(make, model, year, price);

              //add it to the ArrayList
              carList.add(c);
          }
            System.out.println("Current Inventory: ");

             //go through the users
                for (Car c: carList) {
                  //and output them
                    System.out.println(c);
        }
    }
}
