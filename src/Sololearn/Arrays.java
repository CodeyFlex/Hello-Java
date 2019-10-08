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
        for (int sL = 0; sL <= 3; sL++) {
            System.out.println(shopList[sL]);
        } //We close the loop with this, otherwise it would loop the following as well: (i could probably also write break)
        System.out.println(" "); //Space for fanciness

        System.out.println("Now let's use length to figure out the length of our array:");
        System.out.println(shopList.length); //Self explanatory

        System.out.println(" "); //Space for fanciness
        System.out.println("Now let's calculate the sum of all the wares in our shopping list within my array by using a for loop");
        int[] shopListPrices = {6, 10, 2, 500};
        System.out.println("The Salad is " + shopListPrices[0] + "$, Milkshake is " + shopListPrices[1] + "$, Milk is " + shopListPrices[2] + "$, and the cat is " + shopListPrices[3] + "$, which all equals to: ");
        int sum = 0;
        for (int x = 0; x < shopListPrices.length; x++) { //Here we find the value that will tell us how many times to loop the println
            sum += shopListPrices[x];
        }
        System.out.println(sum + "$");

        System.out.println(" "); //Space for fanciness
        System.out.println("Let's try using an enhanced for loop to print out 5 integers: ");
        int[] primes = {4, 2, 81, 3, 22};

        for (int t : primes) { //The : , shall be read as "in" = "int" in "array" (in this case) so in this case t holds the values of the array
            System.out.println(t);
        }
        System.out.println("Now let's try making a multidimensional array: ");
        int[ ][ ] multiD = { {41, 33, 72}, {24, 91, 43} }; //Two [ ] and two { } to indicate multidimensional arrays, this way we declare an array with two arrays as it's elements.
        int m = multiD[1][2]; //First box for the array, second box for the element.
        System.out.println("With this multidimensional array we will grab the 3rd element out of the second array which is 43");
        System.out.println(m); //print out the int with the multidimensional array within it
    }
}
