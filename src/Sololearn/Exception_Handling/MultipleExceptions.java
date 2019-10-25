package Sololearn.Exception_Handling;

import java.util.Scanner;

public class MultipleExceptions {
    static int div(int a, int b) throws ArithmeticException { //"throws" to decide the error message if b is 0
        if (b == 0) {
            throw new ArithmeticException("Division by Zero"); //Throws specific error message for user written inside the "(text)" field
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Type a number to divide with, twice: "); //Informing the user of input request
            Scanner a = new Scanner(System.in);
            Scanner b = new Scanner(System.in);
            System.out.println(div(a.nextInt(), b.nextInt())); //Asking for input
    }
}