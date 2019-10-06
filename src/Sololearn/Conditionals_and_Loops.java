package Sololearn;

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
            System.out.println(" "); //Space for fanciness


            Scanner answerScanner = new Scanner(System.in); //Creates a new scanner

            //Context: https://www.youtube.com/watch?v=9tJRQTW4d8E

            System.out.println("Welcome to the Ayaya theater!"); //Greeting
            System.out.println("Would you like to join us for the 72 hour listening session?! :D"); //Question
            System.out.println("Yes or no?"); //Guidance

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
            } else {
                System.out.println("Huh?"); //Unexpected answer
            //An if statement can contain as many else if statements as you want.


            }
            {
                //Lets use a logical operator to combine multiple conditions:
                System.out.println(" "); //Space for fanciness
                System.out.println("Welcome to the millionaire's club!"); //Greeting
                System.out.println("Are you over the legal age of 18, and also a millionaire?!"); //Question

                int age, money;

                System.out.println(" "); //Space for fanciness
                System.out.println("Type in current legal age:"); //Greeting
                Scanner ageScan = new Scanner(System.in);
                age = ageScan.nextInt();

                System.out.println(" "); //Space for fanciness
                System.out.println("Type in current level of wealth:"); //Greeting
                Scanner moneyScanner = new Scanner(System.in);
                money = moneyScanner.nextInt();

                if (age > 18 && money > 999999) {
                    System.out.println("Welcome to the millionaire's club!"); //Acceptance
                } else {
                    System.out.println("Get out!"); //Rejection
                }

                //Lets work with the OR operator:
                System.out.println(" "); //Space for fanciness
                System.out.println("Let's use an OR operator, to buy stuff we shouldn't since we're 16, but have 700 dollars.");
                System.out.println(" "); //Space for fanciness
                System.out.println("Can i see some ID for this liquor purchase?"); //Greeting

                int age2 = 16;
                int money2 = 700;

                if (age > 18 || money > 200) { //the || is the OR operator
                    System.out.println(" "); //Space for fanciness
                    System.out.println("*You hand over 200 dollars extra to the shop owner*"); //Ye lil sneak
                    System.out.println(" "); //Space for fanciness
                    System.out.println("Looks good to me sir, here's your liquor!"); //Wutang - C.R.E.A.M.
                }
                //Lets work with the switch Statement:
                int path;

                System.out.println(" "); //Space for fanciness
                System.out.println("Choose your path: "); //Choose int value for case choice
                System.out.println(" "); //Space for fanciness
                System.out.println("1: The Wolf Pit");
                System.out.println("2: The Lion Pit");
                System.out.println("3: The Ice Cream Pit");
                System.out.println(" "); //Space for fanciness
                System.out.println("Type a number between: 1-3"); //Waiting for input


                Scanner pathScanner = new Scanner(System.in);
                path = pathScanner.nextInt();

                switch (path) {
                    case 1:
                        System.out.println("The wolves have adopted you, and you're now a wolf puppy."); //Result of typing the number: 1, changing the int named "path" to 1.
                        break; //Break terminates the loop and transfers the execution to the statement immediately following the loop
                    case 2:
                        System.out.println("You're dead... not sure what you expected...");
                        break;
                    case 3:
                        System.out.println("You're dead, but also really cold.");
                        break;
                    default: // If none of my cases are selected, this case will be run instead.
                        System.out.println("That wasn't very 1-3 of you...");
                }
                //Let's do a While loop

                int loopExample = 2;

                System.out.println(" "); //Space for fanciness
                System.out.println("Saw: Let's play a game");//Hint of trick
                System.out.println("Type a number higher than 3: ");//Task

                Scanner loopScanner = new Scanner(System.in);
                loopExample = loopScanner.nextInt();

                while (loopExample >= 3) { //Aslong as the int loopExample is higher than 3, it will loop.
                    System.out.println("Again"); //Do what you're told Sisyfos
                    if (loopExample >= 3) //>= makes it so that 3 is included aswell
                        loopExample = loopScanner.nextInt(); //looping: Waiting for input
                    //adding loopExample--; will make the number lower each loop, and loopExample++; will make the number higher each loop.
                }
                {
                    if (loopExample < 3) //Int needed to end the loop
                        System.out.println("You did the thing you rebel."); //User figured out the trick
                    System.out.println(" "); //Space for fanciness
                }
                //Lets do a for loop
                System.out.println("Lets use a for loop to count from 3 to 8");
                System.out.println(" "); //Space for fanciness
                for (int f = 3; f <= 8; f++) { //For is basically a more compact way of writing while, hence the similarities to my earlier code.
                    System.out.println(f); //f++ makes the loop add 1 to the value of f over and over
                }
                //We can also just print all the even values from 30 to 42
                System.out.println(" "); //Space for fanciness
                System.out.println("How about all the even values from 30 to 42?");
                for (int g = 30; g <= 42; g = g + 2) {
                    System.out.println(g);
                }
                //Lets do a "Do While" loop, these loops are guaranteed to run at least one time cause of "do" in contrast to a while loop.
                System.out.println(" ");
                System.out.println("Let's do a Do While loop to count from 4 to 8");
                int t = 4;
                do {
                    System.out.println(t);
                    t++;
                } while (t < 9);//The loop ends when it reaches this value
            }
        }
        //Let's work with the continue statement
        System.out.println(" ");
        System.out.println("Now let's use the continue function to print out 20, 40 & 80, but not 60:");
        for(int c=20; c<=80; c=c+20) {
            if(c == 60) { //This is the value we will skip
                continue;//This continue statement will skip the value 60, and only output 20, 40 & 80
            }
            System.out.println(c);
        }
        System.out.println("Success!");
    }
}

