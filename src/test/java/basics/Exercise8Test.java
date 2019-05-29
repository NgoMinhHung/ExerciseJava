package basics;

import basics.Exercise8;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise8Test {
    @Test
    public void Test_Exercise8(){
        assertEquals(new Exercise8().calculateFactorial(5), 120); }
}