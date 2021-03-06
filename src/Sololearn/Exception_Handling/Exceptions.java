package Sololearn.Exception_Handling;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner error = new Scanner(System.in);
        int x = 1;

        do { //Loop
            try { //Exception handling
                System.out.println("Enter random number");
                int r1 = error.nextInt(); //Waiting for input
                System.out.println("Enter another random number");
                int r2 = error.nextInt(); //Waiting for input
                int sum = r1 / r2; //Divide the numbers written into program
                System.out.println(sum); //output result
                x=2; //Ends loop if sum is successful, otherwise the exception will stop the program at the part that failed. (sum in this case)
            } catch (Exception e) { //What to do if ANY exception is found, because i wrote Exception into the box.
                System.out.println("Not possible"); //Output if exception has been encountered.
                System.out.println("Try again");
                System.out.println(" ");
                //I can do several of these like this:
                //try {
                //some code
                //} catch (ExceptionType1 e1) {
                //Catch block
                //} catch (ExceptionType2 e2) {
                //Catch block
                //} catch (ExceptionType3 e3) {
                //Catch block

                //This could be done to catch a specific exception, then a less specific exception, and lastly just catching everything else that might happen.
            }
        } while(x==1); //Loop as long as x equals 1
    }
}
