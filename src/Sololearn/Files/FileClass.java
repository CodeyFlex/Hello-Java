package Sololearn.Files;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileClass {
    public static void main(String[] args) {
        File f = new File("C:\\test\\test.txt"); //Finding file
        if (f.exists()) { //Checking if it exists
            System.out.println(f.getName() + " exists!\n"); //It does!
        } else {
            System.out.println("The file does not exist\n"); //It doesn't.
        }
        try {
            File x = new File("C:\\test\\test.txt");
            Scanner sc = new Scanner(x); //The Scanner class inherits from the Iterator, so it behaves like one.
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close(); //Good practice to close when done with use
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        try {
            Formatter formatte = new Formatter("C:\\test\\test.txt"); //Formatter to write a new document
            formatte.format("%s %s %s", "1","Adams", "Apple \r\n"); //Format = write text to document
            formatte.format("%s %s %s", "2","Brownie", "Browns");
            formatte.close(); //Good practice to close when done with use
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}