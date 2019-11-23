package Uni_Projects.Calendar;

import java.util.Date;

public class DateToday {
    public static void main(String[] args) {
        Date date = new Date();
        Date wickDate = new Date();

        wickDate.setTime(1414101600000L); //L cause it's a Long number

        System.out.println("The amount of time since Jan. 1, 1970 is " + date.getTime() + " Milliseconds");
        System.out.println("Todays date is: " + date.toString());
        System.out.println("Todays time is: " + date.getTime());

        System.out.println("Date of top tier action movie release: " + wickDate.toString());
    }
}
