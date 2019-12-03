package Test_Driven_Development;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void swapLast2Chars() { //Testing my method
        StringHelper helper = new StringHelper(); //Creating "helper" to test my StringHelper class, below.
        assertEquals("BA",helper.swapLast2Chars("AB")); //Expecting a specific result, that has to be achieved otherwise the test will fail, and indicate an error in the code.
    }
}