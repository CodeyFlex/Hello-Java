package Sololearn.Vehicle;

class BMW extends Vehicle { //Inherit from the Vehicle class with extends

    public void Honk() { //Naming method
        System.out.println("I'm a BMW, honk!"); //Declaring the methods function
    }

    BMW() { //My subclass
        setcolor("Black");
        setFuelCapacity(145);
        setVehicleHealth(205);
        setwheels(4);
        setMaxSpeed(301);
    }
}
