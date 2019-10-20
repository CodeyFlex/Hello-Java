package Sololearn;


public class More_on_Classes {
    public static void main(String[] args) {

        //There are 4 core concepts in OOP:
        //1. Encapsulation is to ensure that implementation details are not visible to users.
        //The variables of one class will be hidden from the other classes, accessible only through the methods of the current class. This is called data hiding.
        //To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values.
        //Example can be found in Encapsulation package

        //2. Inheritance is the process that enables one class to acquire the properties (methods and variables) of another.
        //With inheritance, the information is placed in a more manageable, hierarchical order.
        //The class inheriting the properties of another is the subclass (also called derived class, or child class)
        //Whilst the class whose properties are inherited is the superclass (base class, or parent class).
        //To inherit from a class, use the extends keyword.
        //I will now try to inherit from my vehicle class (look in vehicle package)

        //3. Polymorphism refers to the idea of "having many forms", it occurs when there is a hierarchy of classes related to each other through inheritance.
        //A call to a member method will cause a different implementation to be executed, depending on the type of the object invoking the method.
        //Overridden methods cannot be more restricted than it's superclass method.
        //Method overriding is also known as runtime polymorphism. (example found in vehicle folder (Mercedes and BMW class)
        //When methods have the same name, but different parameters, it is known as method overloading.
        //Overloading can be very useful when you need the same method functionality for different types of parameters.
        //Another name for method overloading is compile-time polymorphism.

        //4. Abstraction: Data abstraction provides the outside world with only essential information, in a process of representing essential features without including implementation details.
        //In Java, abstraction is achieved using abstract classes and interfaces.
        //An abstract class is defined using the abstract keyword.
        //If i were to make a game (which i will one day), it would be like gravity to the vehicles i created earlier. It's like a protected variable, except it's an entire function.
        //So some of my classes shall inherit from this function.
        //Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
        //But, if a class has at least one abstract method, then the class must be declared abstract.
        //If a class is declared abstract, it cannot be instantiated.
        //If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.

        //Interfaces: An interface is a completely abstract class that contains only abstract methods.
        //An interface is defined by the keyword "interface".
        //It may only contain static final variables.
        //It cannot contain a constructor because interfaces cannot be instantiated.
        //Interfaces can extend other interfaces.
        //A class can implement any number of interfaces.
        //Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
        //Methods in an interface are implicitly public.
        //A class can inherit from just one superclass, but can implement multiple interfaces.
        //Use the implements keyword to use an interface with your class.
        //When you implement an interface, you need to override all of its methods.
        //Example found in interface package

        //Casting: Assigning a value of one type to a variable of another type is known as Type Casting.
        //To cast a value to a specific type, place the type in parentheses and position it in front of the value:
        {
            System.out.println("Let's type cast an int to be 6.62, and then print the resulting value: 6");
            int c = (int) 6.62;
            System.out.println(c); //.62 is cut off

            System.out.println(" ");
            System.out.println("And again, but this time with a double with the value -93.732 with the resulting value -93: ");
            double d = -93.732;
            int b = (int) d;
            System.out.println(b); //.732 is cut off
        }
        //Java supports automatic type casting of integers to floating points, since there is no loss of precision.
        //type casting is mandatory when assigning floating point values to integer variables.
        {
            System.out.println(" ");
            System.out.println("If i instead use math.floor for the double it becomes: ");
            double d = -93.732;
            double b = Math.floor(d);
            System.out.println(b); //Rounded up instead of cut off
        }
        //For classes, there are two types of casting:

        //Upcasting: You can cast an instance of a subclass to its superclass.
        //Example: Furniture a = new armchair();
        //Java automatically upcasted the Cat type variable to the Animal type.

        //Downcasting: Casting an object of a superclass to its subclass is called downcasting.
        //Example: Furniture a = new armchair();
        //((Armchair)a).makeSound();
        //This will try to cast the variable a to the Cat type and call its makeSound() method.

        //Why is upcasting automatic, downcasting manual? Well, upcasting can never fail.
        //But if you have a group of different Animals and want to downcast them all to a Cat, then there's a chance that some of these Animals are actually Dogs, so the process fails.

        //Anonymous classes: are a way to extend the existing classes on the fly.
        //An example would be to take my vehicle method "honk" like this:
        //Vehicle d = new Vehicle() {
        //    @Override public void honk() { //The @Override annotation is used to make your code easier to understand, because it makes it more obvious when methods are overridden. First letter has to be capital.
        //      System.out.println("Doot");
        //    }
        //  };
        //  m.start(); //Output becomes "Doot" instead of the default "Honk-Hoonk!"

        //This modification is applicable only to the current object, and not the class itself.
        //So if we create another object of that class, the start method's implementation will be the one defined in the class. Example: (add to earlier code)
        //Vehicle d2 = new Machine();
        //d2.start(); //Outputs "Honk-Hoonk!"

        //Inner Classes: Java supports nesting classes; a class can be a member of another class.
        //The primary/outer class has an inner class. The inner class can access all of the member variables and methods of its outer class, but it cannot be accessed from any outside class.
        //Example found in Inner_class package.

        //Comparing objects: Remember that when you create objects, the variables store references to the objects.
        //So, when you compare objects using the equality testing operator (==), it actually compares the references and not the object values.
        //Example can be found in the Comparing_Objects package.

        //equals(): Each object has a predefined equals() method that is used for semantical equality testing.

    }
}
