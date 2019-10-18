package Sololearn.Vehicle;

class Mercedes extends Vehicle { //Inherit from the Vehicle class with extends

    public void Honk() { //Naming method
        System.out.println("I'm a Mercedes, honk!"); //Declaring the methods function, this is also called a method override. This override has to be less restricted than the superclass restriction.
                                                    // So if the superclass method is Public, the overriding method in the subclass cannot be private nor protected.
    }

    public void Brake() {
        System.out.println("Mercedes screeech!");
    }

    Mercedes() { //My subclass
        setname("Mercedes");
        setcolor("Red");
        setMaxSpeed(300);
        setwheels(4);
        setVehicleHealth(200);
        setFuelCapacity(150);
    }
}
