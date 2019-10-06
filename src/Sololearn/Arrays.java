package Sololearn;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

                    //Arrays starts counting from 0, so an index of 4 boxes would be: 0 1 2 3
                    String[] shopList = new String[4]; //Here we declare an array of 4 integers
                    //Lets use these indexes to make a shopping list
                    shopList[0] = "Salad"; //Index 0
                    shopList[1] = "Milkshake"; //Index 1
                    shopList[2] = "Milk"; //Index 2
                    shopList[3] = "Cat"; //Index 3

                    System.out.println("Let's print out a shopping list using 4 indexes in an array:");
                    System.out.println(shopList[0]); //Printing Index 0
                    System.out.println(shopList[1]); //Printing Index 1
                    System.out.println(shopList[2]); //Printing Index 2
                    System.out.println(shopList[3]); //Printing Index 3

            System.out.println(" "); //Space for fanciness
            System.out.println("Let's print the array with a loop instead");
            for (int sL=0; sL<=3; sL++){
                    System.out.println(shopList[sL]);
            } //We close the loop with this, otherwise it would loop the following as well: (i could probably also write break)
                System.out.println(" "); //Space for fanciness
                System.out.println("Now let's use length to figure out the length of our array:");
                System.out.println(shopList.length);

    }
}
