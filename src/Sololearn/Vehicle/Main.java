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

        System.out.println("I have set alot of values for different attributes of my vehicle that i will print below: ");
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
    }
}
