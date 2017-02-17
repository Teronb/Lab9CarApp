/**
 * Created by teronb1005 on 2/16/2017.
 */
public class Car {
    //instance variables
    //every instance will have its own value
    //I don't set these here/don't set default values here
    public String make;
    public String model;
    public int year;
    public double price;

    //constructor: a method that sets up a new instance of a class
    //visibility: Should be public
    //Static: Never
    //return type: NONE, not even void
    //name: ALWAYS the class name (match case)
    //argument list: vary (information used to set up the instance)

    //no argument constructor
    //if you don't write a constructor with no arguments,
    //java supplies a default constructor
    public Car () {
        make = "";
        model = "";
        year = 0;
        price = 0.0;
    }

    //"all-arguments" constructor//LOCAL VARIABLES

    public Car (String make, String model, int year, double price) {
        //taking arg
        //storing their values in the instance variables
        //because the local variables/arg will run out of scope
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //getter (accessor): a method, usually public, which provides the value
    // of a private instance variable

    //visibility modifier: usually public
    //static? NEVER
    //return type: the date type of the instance variable in question
    //method name: usually get + variable name ( in camel case)
    //   (for boolean variables, the name might be is + variable name)
    //argument list: usually blank

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //setter (mutator): a method usually public which allows you to set or to modify
    //the value of a private instance of a variable
    //vis modifier: usually public
    // static: NEVER
    //return type; usually void
    //method name: usually set + variable name (in camel case)
    //argument list: usually a single arg, same type as variable in?

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //if I write a toString method
    //  and I match Object's toString header
    //it will run whenever I use an object of this type (Car)
    //  in a String context
    //public String toString() {
        //return make + " (" + model + ")\t" + year + "\n"
                //+ "$" + price + "\n";
    //}
    public String toString() {
        return (make + " " + model + " " + year + " $" + (int)price);
    }
}
