import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
//Java Util Scanner is necessary for the user input function to work.

class MyClass {
  public static void main(String[ ] args) {

    System.out.println("Hey world, i like swimming.");
  //}
//} This has been commented so i can continue the function further down.

//hello there, this is a single line comment.

/* this on the other hand
is a multi line comment
that i will use to tell you my entire life story
here goes...
 */

/** This is my documentation comment, which exists to tell you how good a coder i am, and also click the button to start.*/

// Below is an initial test, removed cause of the later test.
// String name = "Sebastian"

//class MyClass {
  //public static void main(String[ ] args) {
    String name ="Sebastian";
    int age = 26;
    double score =658.9;
    char group = 'H';
    System.out.println(name + " is " + age + " years old & has score: " + score + " in group " + group );

    //input from the user

    Scanner s = new Scanner(System.in);
    System.out.println("Write your input");
    String input = s.next();
    System.out.println("You have written: " + input);


//Boolean online = True
//Above boolean doesn't work right now, but is an example of a true/false function, which is what a Boolean is.

//Public Classes can be accessed by entire project
//Private can only be accessed by code inside same Class
//Protected Classes can only be accessed by functions inside the same folder

//The math operators are as follows:
//+ addition
//- subtraction
//* multiplication
/// division
//% modulo

//I can use these by writing the following function:

int x = 2;
int y = 5;
  int result = x + y;
    System.out.println("x + Y = ");
          System.out.println(result);
    int value = 23;
    int res = value % 6;
    System.out.println("Value % 6 = ");
    System.out.println(res);

      int incrementTest = 43;
      ++incrementTest; // incrementTest is now 44 because i wrote ++"IntegerName"
      System.out.println("The increment test is currently at: ");
      System.out.println(incrementTest);
      System.out.println("instead of 43 cause i wrote ++integerName");

      --incrementTest; // incrementTest is now 43 again because i wrote --"IntegerName"
      System.out.println("The increment test is currently at: ");
      System.out.println(incrementTest);
      System.out.println("instead of 44 cause i wrote --integerName");

      System.out.println("If i instead write integerName-- it will decrease 1 number post decrease instsead of pre decrease. Same goes for writing ++");
    }
  }