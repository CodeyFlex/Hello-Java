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


    }
}
