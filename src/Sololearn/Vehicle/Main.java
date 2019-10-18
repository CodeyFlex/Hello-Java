package Sololearn.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle m = new Mercedes(); //Adding my new subclass to the main
        Vehicle b = new BMW();

        System.out.println(" ");
        System.out.println("My " + m.getname() + " can Honk: ");
        System.out.println(" ");
        m.Honk(); //Using subclass honk

        System.out.println("My color is: " + m.getcolor()); //Getting subclass value
        System.out.println("My fuel Capacity is: " + m.getFuelCapacity());
        System.out.println("My health is: " + m.getVehicleHealth());
        System.out.println("I have " + m.getwheels() + " Wheels");
        System.out.println("My maximum speed is: " + m.getmaxSpeed() + " mph");

        System.out.println(" ");
        System.out.println("And so can my " + b.getname() + ": ");
        System.out.println(" ");
        b.Honk(); //Using second subclass honk

        System.out.println("My color is: " + b.getcolor()); //Getting second subclass value
        System.out.println("My fuel Capacity is: " + b.getFuelCapacity());
        System.out.println("My health is: " + b.getVehicleHealth());
        System.out.println("I have " + b.getwheels() + " Wheels");
        System.out.println("My maximum speed is: " + b.getmaxSpeed() + " mph");
    }
}
