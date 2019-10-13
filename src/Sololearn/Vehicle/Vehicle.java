package Sololearn.Vehicle;

public class Vehicle {
    public void Honk() { //Naming method
        System.out.println("Honk-Hoonk!"); //Declaring the methods function
    }

    public void Brake() {
        System.out.println("Screeech!");
    }
    private int maxSpeed; //Private so it only goes under my vehicle class
    private int wheels;
    private int vehicleHealth;
    private String color;
        Vehicle() { //This is a constructor, a constructor sets the default attribute, in this case the color of my vehicles
            color = "Blue"; //The default here is Blue
    }
    private double fuelCapacity;

    //A constructor can be used to provide initial values for object attributes.
    //- A constructor name must be same as its class name.
    //- A constructor must have no explicit return type.

    //Getters and Setters are used to effectively protect your data, particularly when creating classes. For each variable, the get method returns its value, while the set method sets the value.
    //Getters start with get, followed by the variable name, with the first letter of the variable name capitalized.
    //Setters start with set, followed by the variable name, with the first letter of the variable name capitalized.


    //My getters
    public int getmaxSpeed(){
        return maxSpeed;
    }
    public int getwheels(){
        return wheels;
    }
    public int getVehicleHealth(){
        return vehicleHealth;
    }
    public String getcolor(){
        return color;
    }
    public double getFuelCapacity(){
        return fuelCapacity;
    }

    //My setters

    public void setMaxSpeed(int s) {
        this.maxSpeed = s;
    }
    public void setwheels(int w) {
        this.wheels = w;
    }
    public void setVehicleHealth(int h) {
        this.vehicleHealth = h;
    }
    public void setcolor(String c) {
        this.color = c;
    }
    public void setFuelCapacity(int f) {
        this.fuelCapacity = f;
    }
}
