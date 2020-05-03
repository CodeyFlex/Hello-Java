package PasswordGenerator;

//Learned from example by Robotter112

import java.util.Random;

public class PassGenClass {
    public static void main(String[] args) {
        int length = 15; // password length
        System.out.println(generatePassword(length)); //Prints out a password with the length given earlier
    }

    static char[] generatePassword(int len) {
        System.out.println("Randomly Generated Password:"); //Intro Message

        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //String containing characters in caps
        String chars = "abcdefghijklmnopqrstuvwxyz"; //String containing characters without caps
        String nums = "0123456789"; //String containing numbers
        String symbols = "!@#$%^&*_=+-/€.?<>)"; //String containing symbols

        String passSymbols = charsCaps + chars + nums + symbols; //putting all the strings together into one string
        Random rnd = new Random(); //a new Random for later use

        char[] password = new char[len];
        for (int i = 0; i < len; i++) { //Creating a loop with the length given in the method call
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length())); //Generates a password randomly from the passSymbols String

        }
        return password;
    }

}
