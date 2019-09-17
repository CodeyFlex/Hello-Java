import java.util.Scanner;

class Conditionals_and_Loops {
    public static void main(String[] args) {


        System.out.println(" "); //Space for fanciness
        System.out.println("If int x is less than 53, system will print: hi");

        //if (condition) {
        //Executes when the condition is true
        //Any of the following comparison operators may be used to form the condition:
        //< less than
        //> greater than
        //!= not equal to
        //== equal to
        //<= less than or equal to
        //>= greater than or equal to

        //use if (a.equalsIgnoreCase(b)) for the function to ignore if it's a lower or higher case letter.

        //Write break to get out of an if function

        int x = 12;
        if (x < 53) {
            System.out.println("Hi");


            Scanner answerScanner = new Scanner(System.in); //Creates a new scanner

            //Context: https://www.youtube.com/watch?v=9tJRQTW4d8E

            System.out.println("Welcome to the Ayaya theater!"); //Greeting
            System.out.println("Would you like to join us for the 72 hour listening session?! :D"); //Question

            String answer = answerScanner.next(); //Waiting for input
            String yes = "Yes";
            String no = "No";

            if (answer.equalsIgnoreCase(yes)) //if answer is Yes
            {
                System.out.println("Awww are you sur... oh you said yes...? what's wrong with you?");
            } else if (answer.equalsIgnoreCase(no)) //if answer is No
            {
                System.out.println("No...? oh right, it's opposite day! totally forgot, enjoy your evening! :D");
                System.out.println("*The theater guards drag you in screaming whilst you slowly approach the beautiful Ayaya sounds*");
            }else{
                System.out.println("Huh?");
            }
        }
    }
}
