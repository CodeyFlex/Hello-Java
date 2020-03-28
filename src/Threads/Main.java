package Threads;

public class Main {
    public static void main(String[] args) {

        Thread getTime = new GetTime();

        Runnable getMail = new GetTheMail(5); //This code will be executed after 5 seconds

        Runnable getMailAgain = new GetTheMail(12);//This code will be executed after 12 seconds

        getTime.start(); //Executes the getTime code (currently every 2 seconds)

        new Thread(getMail).start(); //new Thread so that i can print the runnable interface
        new Thread(getMailAgain).start();

    }
}
