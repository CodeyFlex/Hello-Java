package Sololearn.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(); //Truck is now an object of type vehicle
        //Alternatively i can use the constructor to make the car blue:
        //Vehicle truck = new Vehicle("blue");
        truck.setcolor("blue");
        truck.setFuelCapacity(100);
        truck.setVehicleHealth(300);
        truck.setwheels(4);
        truck.setMaxSpeed(60);

        System.out.println("I have set a lot of values for different attributes of my vehicle that i will print below: ");
        System.out.println("Color: " + truck.getcolor());
        System.out.println("Fuel Capacity: " + truck.getFuelCapacity());
        System.out.println("Vehicle health: " + truck.getVehicleHealth());
        System.out.println("Vehicle wheels: " + truck.getwheels());
        System.out.println("Vehicle Max Speed: " + truck.getmaxSpeed());

        System.out.println(" "); //Space for fanciness
        System.out.println("Now i will call the honk method, to make my truck honk:");
        truck.Honk(); //The dot is used to access the object's attributes and methods

        System.out.println(" "); //Space for fanciness
        System.out.println("and also brake:");
        truck.Brake(); //Call method brake

        Vehicle m = new Mercedes(); //Adding my new subclass to the main
        Vehicle b = new BMW();

        System.out.println(" ");
        System.out.println("My Mercedes also honks: ");
        System.out.println(" ");
        m.Honk(); //Using subclass honk

        System.out.println("My color is: " + m.getcolor()); //Getting subclass value
        System.out.println("My fuel Capacity is: " + m.getFuelCapacity());
        System.out.println("My health is: " + m.getVehicleHealth());
        System.out.println("I have " + m.getwheels() + " Wheels");
        System.out.println("My maximum speed is: " + m.getmaxSpeed() + " mph");

        System.out.println(" ");
        System.out.println("And so does my BMW: ");
        System.out.println(" ");
        b.Honk(); //Using second subclass honk

        System.out.println("My color is: " + b.getcolor()); //Getting second subclass value
        System.out.println("My fuel Capacity is: " + b.getFuelCapacity());
        System.out.println("My health is: " + b.getVehicleHealth());
        System.out.println("I have " + b.getwheels() + " Wheels");
        System.out.println("My maximum speed is: " + b.getmaxSpeed() + " mph");
    }
}
