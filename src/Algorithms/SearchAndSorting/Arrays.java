package Algorithms.SearchAndSorting;

public class Arrays {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void randomArrayCreator() { //This method will generate random values to fill my array
        for (int i = 0; i < arraySize; i++) { //As long as i is less than my arraySize, it will keep generating values
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() { //This method will print out my array with some fanciness
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) { //As long as i is less than my arraySize, it will keep printing values

            System.out.print("| " + i + " |");
            System.out.println(theArray[i] + " |");

            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) { //This method grabs the index from the method call, and prints its value

        if (index < arraySize) return theArray[index];

        return 0;

    }

    public boolean doesArrayContainInputValue(int searchValue) { //This method will find a value entered into the method call, and return true/false depending on if the value was found

        boolean valueInArray = false; //defaulting it to false

        for (int i = 0; i < arraySize; i++) {

            if (theArray[i] == searchValue) { //Finds matches within the array

                valueInArray = true; //If there is a match, this boolean will change to true
            }
        }

        return valueInArray;

    }

    public void deleteIndex(int index) { //This method will delete a index in my array that has a specific int entered into the method when called
        if (index < arraySize) {
            for (int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i + 1];
            }

            arraySize--;
        }
    }

    public void insertValue(int value) { //This method will insert a new index into my array consisting of the int entered into the method when called
        if (arraySize < 50) { //Makes sure to not exceed my maximum array size
            theArray[arraySize] = value; //Adding the value to my array from the method call

            arraySize++; //Increases size of my array by 1
        }
    }

    //The Linear search simply goes through all array values linearly (Index 1 - 2 - 3 - 4 and so on)

    public String linearSearchForValue(int value) { //This method will find the arrays with the value that was put into the method call, and list them for the user.

        boolean valueInArray = false; //Defaulting to false

        String indexsWithInputValue = " ";

        System.out.println("The value was found in the following: ");

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) { //Finds all matches to the method input
                valueInArray = true; //If found this boolean changes to true

                System.out.println(i + " ");

                indexsWithInputValue += i + " "; //Adds all matches found
            }
        }

        if (!valueInArray) { //If no matches were found, the method will return "None"
            indexsWithInputValue = "None";

            System.out.println(indexsWithInputValue); //Prints out matches if any was found
        }

        return indexsWithInputValue;
    }

    public void printHorizontalArray(int i, int j){ //This method will be used to show the functionality of the algorithms

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++){
            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < arraySize; n++){

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for (int n = 0; n < 51; n++) System.out.print("-");

        System.out.println();

        if (j != -1){

            for (int k = 0; k < ((j*5)+2); k++) System.out.print(" ");

            System.out.print(j);
        }

        if (i != -1){

            for (int l = 0; l < (5*(i - j)-1); l++) System.out.print(" ");

            System.out.print(i);
        }

        System.out.println();

    }

    //Bubblesort will sort everything from smallest to largest, or largest to smallest.

    public void bubbleSort() {

        for (int i = arraySize - 1; i > 1; i--) { // -1 because the arraySize is 10, but there's only 9 indexes

            for (int j = 0; j < i; j++){
                if(theArray[j] > theArray[j+1]){ //The > will sort everything from smallest to largest, if changed to < it will sort largest to smallest.
                    swapValues(j, j+1); //Sorts the values into desired ranking ^

                    printHorizontalArray(i, j);

                }

            }

        }

//        System.out.println("Sorting Array: ");

    }

    public void swapValues(int indexOne, int indexTwo){ //This method will be used to move the values around in the array

        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;

    }

    //The binary search will find the first match to method input in a sorted array by repeatedly dividing the search interval in half.

    public void binarySearchForValue(int value){

        //Interval covering the whole array

        int lowIndex = 0;
        int highIndex = arraySize - 1;

        // ^

        while (lowIndex <= highIndex){
            int middleIndex = (highIndex + lowIndex) / 2; //Dividing the search interval in half

            if (theArray[middleIndex] < value) lowIndex = middleIndex + 1;

            else if (theArray[middleIndex] > value) highIndex = middleIndex - 1;

            else {
                System.out.println("\nFound a match for " + value + " at index " + middleIndex);

                lowIndex = highIndex + 1;
            }

            printHorizontalArray(middleIndex, -1);

        }

    }

    //The selection sort will save the smallest number as it finds it, and then repeat searching the entire array, slowly putting it all in order as it finds the smallest numbers.

    public void selectionSort(){

        for (int x = 0; x < arraySize; x++){

            int minimum = x;

            for (int y = x; y < arraySize; y++){

                if (theArray[minimum] > theArray[y]){ //Change > to < if descending sort is wanted instead of ascending

                    minimum = y;

                }

                swapValues(x, minimum);

                printHorizontalArray(x, -1);

            }
        }

    }

    //The insertion sort inserts the lowest value before the nearest higher value until it's sorted.

    public void insertionSort(){

        for (int i = 1; i < arraySize; i++){

            int j = i;

            int toInsert = theArray[i];

            while ((j > 0) && (theArray[j-1] > toInsert)){

                theArray[j] = theArray[j-1];
                j--;

                printHorizontalArray(i, j);

            }

            theArray[j] = toInsert;

            printHorizontalArray(i, j);

            System.out.println("\nArray[i] = " + theArray[i] +
                    " Array[j] = " + theArray[j] + " toInsert = " + toInsert);

        }

    }

    public static void main(String[] args) {

        Arrays newArray = new Arrays();

        newArray.randomArrayCreator();

        newArray.printArray();

        System.out.println("Value at index 3: ");

        System.out.println(newArray.getValueAtIndex(3));

        System.out.println("Does array contain 14?");

        System.out.println(newArray.doesArrayContainInputValue(14));

        System.out.println("Delete index 4");

        newArray.deleteIndex(4);

        newArray.printArray();

        System.out.println("Insert value 44");

        newArray.insertValue(44);

        newArray.printArray();

        System.out.println("Linear Search");

        newArray.linearSearchForValue(17);

        System.out.println("Bubblesort: ");

        newArray.bubbleSort();

        System.out.println("Binary Search for the value 10: ");

        newArray.binarySearchForValue(10);

        newArray.randomArrayCreator(); //Resetting the array so i can show off a new sorting algorithm

        System.out.println("Selection sort: ");

        newArray.selectionSort();

        newArray.randomArrayCreator(); //Another reset

        System.out.println("Insertion Sort: ");

        newArray.insertionSort();
    }
}
