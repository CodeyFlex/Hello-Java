package Algorithms.Sorting;

public class Arrays {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void randomArrayCreator(){ //This method will generate random values to fill my array
        for(int i = 0; i < arraySize; i++){ //As long as i is less than my arraySize, it will keep generating values
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray(){ //This method will print out my array with some fanciness
        System.out.println("----------");
        for(int i = 0; i <arraySize; i++){ //As long as i is less than my arraySize, it will keep printing values

            System.out.print("| " + i + " |");
            System.out.println(theArray[i] + " |");

            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index){ //This method grabs the index from the method call, and prints its value

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

    public void deleteIndex(int index){ //This method will delete a index in my array that has a specific int entered into the method when called
        if (index < arraySize){
            for(int i = index; i < (arraySize - 1); i++){
                theArray[i] = theArray[i+1];
            }

            arraySize--;
        }
    }

    public void insertValue(int value){ //This method will insert a new index into my array consisting of the int entered into the method when called
        if(arraySize < 50){ //Makes sure to not exceed my maximum array size
            theArray[arraySize] = value; //Adding the value to my array from the method call

            arraySize++; //Increases size of my array by 1
        }
    }

    public String linearSearchForValue(int value){ //This method will find the arrays with the value that was put into the method call, and list them for the user.

        boolean valueInArray = false; //Defaulting to false

        String indexsWithInputValue = " ";

        System.out.println("The value was found in the following: ");

        for (int i = 0; i < arraySize; i++){
            if(theArray[i] == value){ //Finds all matches to the method input
                valueInArray = true; //If found this boolean changes to true

                System.out.println(i + " ");

                indexsWithInputValue+= i + " "; //Adds all matches found
            }
        }

        if(!valueInArray){ //If no matches were found, the method will return "None"
            indexsWithInputValue = "None";

            System.out.println(indexsWithInputValue); //Prints out matches if any was found
        }

        return indexsWithInputValue;
    }

    public static void main(String[] args) {

        Arrays newArray = new Arrays();

        newArray.randomArrayCreator();

        newArray.printArray();

        System.out.println(newArray.getValueAtIndex(3));

        System.out.println(newArray.doesArrayContainInputValue(14));

        newArray.deleteIndex(4);

        newArray.printArray();

        newArray.insertValue(44);

        newArray.printArray();

        newArray.linearSearchForValue(17);
    }
}
