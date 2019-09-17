import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
//Java Util Scanner is necessary for the user input function to work.

class MyClass {
  public static void main(String[ ] args) {

    System.out.println("Hey world, i like swimming.");
      System.out.println(" "); //Space for fanciness
  //}
//} This has been commented so i can continue the function further down.

//hello there, this is a single line comment.

/* this on the other hand
is a multi line comment
that i will use to tell you my entire life story
here goes...
 */

/** This is my documentation comment, which exists to tell you how good a coder i am, and also click the button to start.*/

      System.out.println("I will now create a personal description with a int, a double, and a char.");

    String name ="Sebastian";
    int age = 26;
    double score =658.9;
    char group = 'H';
    System.out.println(name + " is " + age + " years old & has score: " + score + " in group " + group );

      System.out.println(" "); //Space for fanciness
      System.out.println("Input from the user");
    Scanner s = new Scanner(System.in);
    System.out.println("Write your input");
    String input = s.next();
    System.out.println("You have written: " + input);

      System.out.println(" "); //Space for fanciness
      Scanner variable = new Scanner(System.in);
      String food;
      System.out.println("What's your favourite food?");
      food = variable.nextLine();
      System.out.println("Wow... that sounds... different... but you do you!");

      //Read a byte - nextByte()
      //Read a short - nextShort()
      //Read an int - nextInt()
      //Read a long - nextLong()
      //Read a float - nextFloat()
      //Read a double - nextDouble()
      //Read a boolean - nextBoolean()
      //Read a complete line - nextLine()
      //Read a word - next()


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

      System.out.println(" "); //Space for fanciness
int x = 2;
int y = 5;
  int result = x + y;
    System.out.println("x + Y = ");
          System.out.println(result);

      System.out.println(" "); //Space for fanciness
      int value = 23;
    int res = value % 6;
    System.out.println("Value % 6 = ");
    System.out.println(res);

      System.out.println(" "); //Space for fanciness
      int incrementTest = 43;
      ++incrementTest; // incrementTest is now 44 because i wrote ++"IntegerName"
      System.out.println("The increment test is currently at: ");
      System.out.println(incrementTest);
      System.out.println("instead of 43 cause i wrote ++integerName");

      System.out.println(" "); //Space for fanciness
      --incrementTest; // incrementTest is now 43 again because i wrote --"IntegerName"
      System.out.println("The increment test is currently at: ");
      System.out.println(incrementTest);
      System.out.println("instead of 44 cause i wrote --integerName");

      System.out.println(" "); //Space for fanciness
      System.out.println("If i instead write integerName-- it will decrease 1 number post decrease instead of pre decrease. Same goes for writing ++");

      int num6 = 78;
      int num7 = 12;
      num6 += num7; // num7 = num6 + num7;
      System.out.println(" "); //Space for fanciness
      System.out.println("now i will add two integers to eachother with +=: num6 + num7 = ");
      System.out.println(num6);
      // num7 is 12 and num6 will become 90 instead of 78

      //x+=y means x=x+y
      //x-=y means x=x-y
      //x*=y means x=x*y
      //x/=y means x=x/y
      //x%=y means x=x%y

//Strings: Represents a sequence of characters
      System.out.println(" "); //Space for fanciness
      System.out.println("To display a string i will write: ");
String w = "World";

      String var;
      var = "Hello ";
      System.out.println(var);
      System.out.println(w);
      System.out.println("and this way i'm displaying a variable, and a string to put together the words: Hello World)");

      System.out.println(" "); //Space for fanciness
      System.out.println("Now i will create two strings, and put them together: ");
      String firstName, lastName;
      firstName = "Codey";
      lastName = "Flex";
      System.out.println("My name is " + firstName +" "+lastName);

      //A char is a single letter
    }
  }