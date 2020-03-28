package Threads;

public class GetTheMail implements Runnable {

    private int startTime; //Decides how much time till code is executed

    public GetTheMail(int startTime) { //This way the amount of time till code is executed can be inserted into the method call
        this.startTime = startTime;
    }

    public void run() { //All the code that the thread executes must be inside of this run method.
        try {
            Thread.sleep(startTime * 1000); //startTime * 1000, as to convert the int from milliseconds to seconds.
        }
        catch (InterruptedException e) { //InterruptedException is called every time sleep is called.

        }
        System.out.println("Checking Mail");
    }

}
