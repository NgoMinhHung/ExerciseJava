package basics;

import basics.Exercise20;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise20Test {
    @Test
    public void Test_sumFibonacci(){
        assertEquals(new Exercise20().sumFirtsNumbersOfFibonacci(10),143);
    }
}
