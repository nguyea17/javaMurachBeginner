/*
This exercise helps to clarify the class and object initialization.
Class is a template that can be used to create an object.
As variable car1 is a reference, we can reference other objects to the Vehicle
class by using the new keyword.
 */
package vehicledemo;



/**
 *
 * @author hungl
 */
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vehicle car1 = new Vehicle();
       car1.passengers = 7;
       car1.fuelcap = 16;
       car1.mpg = 21;
       
       System.out.println("Vehicle 1 can run " + car1.mpg + " per gallon");
       
       //Vehicle car2 = new Vehicle();
       Vehicle car2 = car1;       
       System.out.println ("Vehicle 2 can have " + car2.passengers + " passengers");
       
       Vehicle car3 = car2;
       System.out.println("Vehicle 3 has a fuelcap of " + car3.fuelcap +" gallons");
       
    }
    
}
