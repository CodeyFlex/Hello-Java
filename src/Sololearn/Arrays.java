package Sololearn;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        //Arrays starts counting from 0, so an index of 4 boxes would be: 0 1 2 3
String[] shopList = new String[4]; //Here we declare an array of 4 integers
        //Lets use these indexes to make a shopping list
        shopList[0] = "Salad";
        shopList[1] = "Milkshake";
        shopList[2] = "Milk";
        shopList[3] = "cat";

        System.out.println("Let's print out a shopping list using 4 indexes in an array:");
        System.out.println(shopList[0]);
        System.out.println(shopList[1]);
        System.out.println(shopList[2]);
        System.out.println(shopList[3]);
    }
}
