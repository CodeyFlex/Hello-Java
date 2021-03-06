package Sololearn;

import java.util.*;

public class Exceptions_Lists_Threads_Files {

    //Exceptions: is a problem that occurs during program execution. Exceptions cause abnormal termination of the program.
    //Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.

    //An exception can occur for many different reasons. Some examples:
    //- A user has entered invalid data.
    //- A file that needs to be opened cannot be found.
    //- A network connection has been lost in the middle of communications.
    //- Insufficient memory and other issues related to physical resources.
    //So exceptions are caused by user error, programmer error, or physical resource issues. However, a well-written program should handle all possible exceptions.
    //Example can be found in Exception_Handling package.
    //There are two exception types, checked and unchecked (also called runtime).
    //The main difference is that checked exceptions are checked when compiled, while unchecked exceptions are checked at runtime.

    //Unchecked exceptions: (Example would be when dividing by 0 in the Exception_Handling package.)
    //Represent defects in the program(bugs),  often invalid arguments passed to a non-private method.
    //I don't need to establish a policy for them.

    //Checked exceptions:
    //Represent invalid conditions in areas outside the immediate control of the program,  often invalid user input,  database problems, network,  absent files.
    //I must establish a policy for them by a try/catch block.

    //Threads: Java is a multi-threaded programming language.
    //This means that my program can make optimal use of available resources by running two or more components concurrently, with each component handling a different task.
    //I can subdivide specific operations within a single application into individual threads that all run in parallel.
    //There are two ways to create a thread.
    //1. Extend the Thread class (Example in ExtendThread package)
    //Inherit from the Thread class, override its run() method, and write the functionality of the thread in the run() method.
    //2. Implementing the Runnable interface. (Example in InterfaceThread package)
    //If i extend a class, it cannot extend any other class. That's why implementing a Runnable interface is smart, as it has the ability to extend another class.

    //ArrayList: Can be used to store and manipulate groups of objects.
    //Standard Java arrays are of a fixed length, which means that after they are created, they cannot expand or shrink.
    //ArrayLists are created with an initial size, but when this size is exceeded, the collection is automatically enlarged.
    //Example:
    public static void main(String[] args) {
        ArrayList<String> superPowers = new ArrayList<String>(4); //initial value is 4, but is increased to 5 automatically.
        System.out.println("ArrayList:\n ");
        superPowers.add("Fire Breath"); //Adds a new object to the array list.
        superPowers.add("Ice Breath");
        superPowers.add("Gas Breath");
        superPowers.add("Lava Breath");
        superPowers.remove("Gas Breath"); //Removes an object from the array list.
        superPowers.add("Invisibility");
        superPowers.add("Lightning Breath");
        /* superPowers.clear() to clear the ArrayList */
        System.out.println(superPowers.get(4)); //Outputs the fifth object in the array list.
        System.out.println(superPowers.contains("Fire Breath")); //Checks if Fire Breath string is inside the array list.
        System.out.println(superPowers.size()); //Outputs size of the array list.
        System.out.println(superPowers); //Outputs the entire array list.
        //Similar examples can be found in the Arrays class

        //LinkedList: is very similar in syntax to the ArrayList.
        //I can easily change an ArrayList to a LinkedList by changing the object type.
        //I cannot specify an initial capacity for the LinkedList.
        LinkedList<String> linkedSuperPowers = new LinkedList<String>();
        System.out.println("\nLinkedlist: \n");
        linkedSuperPowers.add("Hot Breath");
        linkedSuperPowers.add("Cold Breath");
        linkedSuperPowers.add("Stinky Breath");
        linkedSuperPowers.add("Burning Breath");
        linkedSuperPowers.remove("Stinky Breath");
        linkedSuperPowers.add("Yawny Breath");
        linkedSuperPowers.add("Nuke Breath");
        System.out.println(linkedSuperPowers.get(4));
        System.out.println(linkedSuperPowers.contains("Hot Breath"));
        System.out.println(linkedSuperPowers.size());
        System.out.println(linkedSuperPowers);

        //The most notable difference between the LinkedList and the ArrayList is in the way they store objects.
        //The ArrayList is better for storing and accessing data, as it is very similar to a normal array.
        //The LinkedList is better for manipulating data, such as making numerous inserts and deletes.
        //In addition to storing the object, the LinkedList stores the memory address (or link) of the element that follows it.
        //It's called a LinkedList because each element contains a link to the neighboring element.
        //So in Summary:
        //Use an ArrayList when rapid access to data is needed.
        //Use a LinkedList when i need to make a large number of inserts and/or deletes.

        //Hashmap: is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value).
        //A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
        //The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
        //If i try to get a value that is not present in my map, it will return the value: null.
        //Example can be found in the Hashmap package

        //Sets: A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.
        //HashSet class:
        System.out.println("\nHashSet:\n");
        HashSet<String> set = new HashSet<String>();
        set.add("Coolest");
        set.add("Set");
        System.out.println(set);

        System.out.println("\nLet's try sorting this set and printing it again:\n");
        List<String> setList = new ArrayList<String>(set); //Turning hashSet into a list
        Collections.sort(setList); //Sorting my list
        System.out.println(setList);

        //The HashSet class does not automatically retain the order of the elements as they're added.
        //To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in the order in which they were inserted.

        //Hashing: A hash table stores information through a mechanism called hashing, in which a key's informational content is used to determine a unique value called a hash code.
        //Each element in the HashSet is associated with its unique hash code.

        //Other useful methods in the Collections class:
        //max(Collection c): Returns the maximum element in c as determined by natural ordering.
        //min(Collection c): Returns the minimum element in c as determined by natural ordering.
        //reverse(List list): Reverses the sequence in list.
        //shuffle(List list): Shuffles (i.e., randomizes) the elements in list.

        //Iterators: is an object that enables to cycle through a collection, obtain or remove elements.
        //Before i can access a collection through an iterator, i must obtain one.
        //Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection.
        //By using this iterator object, i can access each element in the collection, one element at a time.

        //The Iterator class provides the following methods:
        //hasNext(): Returns true if there is at least one more element; otherwise, it returns false.
        //next(): Returns the next object and advances the iterator.
        //remove(): Removes the last object that was returned by next from the collection.
        //Example can be found in Iterator Package:

        //Working with files: The java.io package includes a File class that allows you to work with files.
        //Example can be found in files package
    }
}
