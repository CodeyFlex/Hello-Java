package Sololearn;

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

}
