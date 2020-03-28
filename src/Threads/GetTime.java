package Threads;

//Using Threads is basically telling the program that several blocks of code are gonna run at the same time.

import java.util.*;     //For dates and locations
import java.text.DateFormat;    //To edit and format dates

public class GetTime extends Thread{ //For access to the methods in the Thread class
                                    //Since i can only extend one class, i will use a Runnable interface in the "GetTheMail" class.

    public void run(){ //All the code that the thread executes must be inside of this run method.

        Date rightNow;
        Locale currentLocale;
        DateFormat timeFormatter;
        DateFormat dateFormatter;
        String timeOutput;
        String dateOutput;

        for(int i = 1; i <= 20; i++){ //Looping till "i" becomes 20

            rightNow = new Date(); //Gets the current date
            currentLocale = new Locale("dk"); //Gets region specific information, in this case "Denmark".

            timeFormatter = DateFormat.getTimeInstance(DateFormat.FULL, currentLocale); //Formats the data into preset styles (Full)
            dateFormatter = DateFormat.getDateInstance(DateFormat.FULL, currentLocale); //Other options are: Default, Short, Medium & Long ^

            timeOutput = timeFormatter.format(rightNow); //To output to screen
            dateOutput = dateFormatter.format(rightNow);

            System.out.println(timeOutput);
            System.out.println(dateOutput);
            System.out.println();

            try { //Always wrap the sleep method within a try block, so exceptions can be caught.
                Thread.sleep(2000); //Whilst getting above information, the program will sleep for 2 seconds.
            }
            catch(InterruptedException e){ //InterruptedException is called every time sleep is called.

            }
        }

    }

}
