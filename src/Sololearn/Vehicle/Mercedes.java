package Sololearn.Vehicle;

class Mercedes extends Vehicle { //Inherit from the Vehicle class with extends

    public void Honk() { //Naming method
        System.out.println("I'm a Mercedes, honk!"); //Declaring the methods function
    }

    Mercedes() {
        setcolor("Red");
        setFuelCapacity(150);
        setVehicleHealth(200);
        setwheels(4);
        setMaxSpeed(300);
    }
}
