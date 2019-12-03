package Test_Driven_Development;

public class StringHelper {

    public String swapLast2Chars(String str) { //My method
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        return "" + secondChar + firstChar; //The function of my method
    }

    //The Three Laws of TDD
    //1. You are not allowed to write any production code unless it is to make a failing unit test pass.
    //2. You are not allowed to write any more of a unit test than is sufficient to fail; and compilation failures are failures.
    //3. You are not allowed to write any more production code than is sufficient to pass the one failing unit test.

    //Process:
    //1. Write a new Test which fails
    //2. Write simplest possible code to make it succeed
    //3. Refactor the code (including test code) to meet "4 principles of simple design"
    //4. (reference to 3.) Keep the test simple
}
