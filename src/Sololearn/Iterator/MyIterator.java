package Sololearn.Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class MyIterator {
    public static void main(String[] args) {
        LinkedList<String> Gloves = new LinkedList<String>();
        Gloves.add("Driving Gloves");
        Gloves.add("Boxing Gloves");
        Gloves.add("MMA Gloves");
        Gloves.add("Silk Gloves");

        Iterator<String> it = Gloves.iterator(); //it is the iterator
        //String value = it.next(); //<-- One way to do this
        //Collections.sort(Gloves); //<-- If i wanna sort my list first
        while (it.hasNext()) { //Each time i call it.next(), the iterator moves to the next element of the list.
            System.out.println(it.next());
        }
    }
}