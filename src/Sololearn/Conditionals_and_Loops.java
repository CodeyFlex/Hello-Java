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
            }else{
                System.out.println("Huh?"); //Unexpected answer
//An if statement can contain as many else if statements as you want.


                 }
            {
            //Lets use a logical operator to combine multiple conditions:
            System.out.println(" "); //Space for fanciness
            System.out.println("Welcome to the millionaire's club!"); //Greeting
            System.out.println("Are you over the legal age of 18, and also a millionaire?!"); //Question

            int age,money;

            System.out.println(" "); //Space for fanciness
            System.out.println("Type in current legal age:"); //Greeting
            Scanner ageScan = new Scanner(System.in);
            age = ageScan.nextInt();

            System.out.println(" "); //Space for fanciness
            System.out.println("Type in current level of wealth:"); //Greeting
            Scanner moneyScanner = new Scanner(System.in);
            money = moneyScanner.nextInt();

            if(age>18 && money>1000000)
                {
                System.out.println("Welcome to the millionaire's club!"); //Acceptance
                }else{
                System.out.println("Get out!"); //Rejection
                }

            //Lets work with the OR operator:
            System.out.println(" "); //Space for fanciness
            System.out.println("Can i see some ID for this liquor purchase?"); //Greeting

                int age2 = 16;
                int money2 = 700;

                System.out.println(" "); //Space for fanciness
                System.out.println("*You hand over 200 dollars extra to the shop owner*"); //Ye lil sneak

                if (age > 18 || money > 500) { //the || is the OR operator
                    System.out.println(" "); //Space for fanciness
                    System.out.println("Looks good to me sir, here's your liquor!"); //Wutang - C.R.E.A.M.

                    //Lets work with the switch Statement:
                    int day = 2;

                    System.out.println(" "); //Space for fanciness
                    System.out.println("What day is it today?");
                    System.out.println("Type a day with a number: 1-7, 1 being monday, 2 being tuesday...");

                    Scanner dayScanner = new Scanner(System.in);
                    day = dayScanner.nextInt();

                    switch(day) {
                        case 1:
                            System.out.println("Monday"); // Outputs "Monday"
                            break;
                        case 2:
                            System.out.println("Tuesday"); // Outputs "Tuesday"
                            break;
                        case 3:
                            System.out.println("Wednesday"); // Outputs "Wednesday"
                            break;
                        case 4:
                            System.out.println("Thursday"); // Outputs "Thursday"
                            break;
                        case 5:
                            System.out.println("Friday"); // Outputs "Friday"
                            break;
                        case 6:
                            System.out.println("Saturday");// Outputs "Saturday"
                            break;
                        case 7:
                            System.out.println("Sunday");// Outputs "Sunday"
                            break;
                        }

                   }
              }
        }
    }
}
