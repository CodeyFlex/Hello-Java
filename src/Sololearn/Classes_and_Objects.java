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

    static int greatest(int a, int b) {
        if (a > b) { //Find greatest int and return it
            return a; //If a is highest
        } else {
            return b; //if b is highest
        }
    }
    //or the shorter version:
    //static int greatest (int a,int b){
    //    return (a>b)?a:b;
    //}

    public static final double PI = 3.14; //Declaring variable constant with the 'final' keyword.

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

        //Now i'm gonna create a car class, and make it honk & brake. (can be found in the vehicle folder)

        //Access modifiers:
        //default: A variable or method declared with no access control modifier is available to any other class in the same package.
        //public: Accessible from any other class.
        //protected: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass).
        //private: Accessible only within the declared class itself.

        System.out.println(" ");
        System.out.println("Math Classes: ");
        System.out.println(" ");

        System.out.println("Math.abs() returns the absolute value of its parameter.");
        System.out.println(" ");
        System.out.println("So the absolute value of 30 is: ");
        int mathAbsPlus = Math.abs(30);  //finds absolute value
        System.out.println(mathAbsPlus);

        System.out.println(" ");
        System.out.println("And the absolute value of -40 is: ");
        int mathAbsMinus = Math.abs(-40);
        System.out.println(mathAbsMinus);

        System.out.println(" ");
        System.out.println("Math.ceil() rounds a floating point value up to the nearest integer value. The rounded value is returned as a double.");
        System.out.println(" ");
        System.out.println("So the rounded up value of 19.289 is: ");
        double mathCeil = Math.ceil(19.289);
        System.out.println(mathCeil);

        System.out.println(" ");
        System.out.println("Similarly, Math.floor() rounds a floating point value down to the nearest integer value.");
        System.out.println(" ");
        System.out.println("So the rounded down value of 14.273 is: ");
        double mathFloor = Math.floor(14.273);
        System.out.println(mathFloor);

        System.out.println(" ");
        System.out.println("Math.max() returns the largest of its parameters.");
        System.out.println(" ");
        System.out.println("So the highest value of 32 and 90 is: ");
        int mathMax = Math.max(32, 90);
        System.out.println(mathMax);

        System.out.println(" ");
        System.out.println("Conversely, Math.min() returns the smallest parameter.");
        System.out.println(" ");
        System.out.println("So the smallest value of 32 and 90 is: ");
        int mathMin = Math.min(32, 90);
        System.out.println(mathMin);

        System.out.println(" ");
        System.out.println("Math.pow() takes two parameters and returns the first parameter raised to the power of the second parameter.");
        System.out.println(" ");
        System.out.println("So the 4 raised 3 times equals: ");
        double mathPow = Math.pow(4, 3);
        System.out.println(mathPow);

        System.out.println(" ");
        System.out.println("Math.sqrt() finds the square root of the parameters: ");
        System.out.println(" ");
        System.out.println("So the square root of 9 is: ");
        double mathSqrt = Math.sqrt(9);
        System.out.println(mathSqrt);

        System.out.println(" ");
        System.out.println("Math.sin will find the trigonometric sine of an angle: ");
        System.out.println(" ");
        System.out.println("So the sine of 12 is: ");
        double mathSin = Math.sin(12);
        System.out.println(mathSin);

        System.out.println(" ");
        System.out.println("Math.cos will find the trigonometric cos of an angle: ");
        System.out.println(" ");
        System.out.println("So the cos of 60 is: ");
        double radian = 60;
        double mathCos = Math.cos(radian); //This could also just be a direct number value instead of a double
        System.out.println(mathCos);

        //Declaring a variable/Method as a static, will make it belong to the class it's written within, rather than a specific instance.
        //This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.

        System.out.println(" ");
        System.out.println("Let's use the 'final' keyword to mark a variable constant: ");
        System.out.println("In this case i will declare PI to be 3.14: ");
        System.out.println(PI); //Declared up top
    }
}
