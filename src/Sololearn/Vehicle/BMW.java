package Sololearn.Vehicle;

class BMW extends Vehicle { //Inherit from the Vehicle class with extends

    public void Honk() { //Naming method
        System.out.println("I'm a BMW, honk!"); //Declaring the methods function, this is also called a method override.
                                                // So if the superclass method is Public, the overriding method in the subclass cannot be private nor protected.
    }

    public void Brake() {
        System.out.println("BMW screeech!");
    }

    BMW() { //My subclass
        setname("BMW");
        setcolor("Black");
        setFuelCapacity(145);
        setVehicleHealth(205);
        setwheels(4);
        setMaxSpeed(301);
    }
}
