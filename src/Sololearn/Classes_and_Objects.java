package Sololearn;

import java.sql.SQLOutput;

public class Classes_and_Objects {

    static void sayCheese() { //Naming my method. Adding (String food) to expand the sout with a chosen string.
        System.out.println("Cheese!"); //Giving my method it's function
    }
    static void sayCheesePlus(String food) { //Adding a String called "food" to the method
        System.out.println("Cheese" + food); //Giving my method it's function along with a named String
    }

    public static void main(String[] args) {

        //in object oriented programming, each object has three dimensions: identity, attributes, and behavior.
        // Attributes describe the object's current state, and what the object is capable of doing is demonstrated through the object's behavior.

        //A class describes what the object will be, but is separate from the object itself.
        //An object is an instance of a class

        //example: Class: Human being       Object : Man, Woman

        //Methods define behavior. System.out.println() is an example of a method.

        System.out.println("I can define my own method as such:");
        //Type static void sayCheese() above psvm
        //System.out.println("Cheese!");
        //}
        System.out.println("And have it say Cheese!");
        sayCheese(); //Call the Method (i can do this as many times as i want.)
        
        System.out.println(" "); //Space for fanciness
        System.out.println("I can also expand on my method with a string that says PARTY!");
        sayCheesePlus(" PARTY!"); //Adding string to the call
    }
}
