package Sololearn;

import java.sql.SQLOutput;

public class Classes_and_Objects {

    static void sayCheese() { //Naming my method. Adding (String food) to expand the sout with a chosen string.
        System.out.println("Cheese!"); //Giving my method it's function
    }
    static void sayCheesePlus(String food) { //Adding a String called "food" to the method
        System.out.println("Cheese" + food); //Giving my method it's function along with a named String
    }
    static int sum(int value1, int value2) { //Naming my method and adding two integers inside it
        return value1 + value2; //Giving my method it's return function
    }
        //Whenever i don't need to return a value from my method, use the keyword void.
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

        System.out.println(" "); //Space for fanciness
        System.out.println("Let's use a return with a method to return a sum value of 2 + 5: ");
        //Method written above psvm
        int r = sum(2, 5); //Similar to the calculator, i get the sum of the two values inside the box
        System.out.println(r); //Print sum of r

        System.out.println(" "); //Space for fanciness
        System.out.println("Now let's take two parameters of type int, and return the greater one of 17 & 79: ");
        int great = greatest(17, 79); //add two values that compete to be highest
        System.out.println(great); //print out highest int
    }

    static int greatest(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
        //or the shorter version:
        //static int max (int a,int b){
        //    return (a>b)?a:b;
        //}
    }
}
