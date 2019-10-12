package Sololearn.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(); //Truck is now an object of type vehicle
        truck.color ="blue";
        truck.fuelCapacity = 100;
        truck.vehicleHealth = 300;
        truck.wheels = 4;
        truck.maxSpeed = 60;

        System.out.println("Now i will call the honk method, to make my truck honk:");
        truck.Honk(); //The dot is used to access the object's attributes and methods

        System.out.println(" "); //Space for fanciness
        System.out.println("and also brake:");
        truck.Brake(); //Call method brake
    }
}
