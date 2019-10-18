package Sololearn.Vehicle;

public abstract class Vehicle {
    public void Honk() { //Naming method
        System.out.println("Honk-Hoonk!"); //Declaring the methods function
    }

    public void Brake() {
        System.out.println("Screeech!");
    }

    private String name;
    private String color; //Private so it only goes under my vehicle class
    private int maxSpeed;
    private int wheels;
    private int vehicleHealth;
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

    public String getname(){
        return name;
    }
    public String getcolor(){
        return color;
    }
    public double getFuelCapacity(){
        return fuelCapacity;
    }
    public int getVehicleHealth(){
        return vehicleHealth;
    }
    public int getwheels(){
        return wheels;
    }
    public int getmaxSpeed(){
        return maxSpeed;
    }

    //My setters

    public void setname(String n) {
        this.name = n;
    }
    public void setcolor(String c) {
        this.color = c;
    }
    public void setFuelCapacity(int f) {
        this.fuelCapacity = f;
    }
    public void setVehicleHealth(int h) {
        this.vehicleHealth = h;
    }
    public void setwheels(int w) {
        this.wheels = w;
    }
    public void setMaxSpeed(int s) {
        this.maxSpeed = s;
    }
}
