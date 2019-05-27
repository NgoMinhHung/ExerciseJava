import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise21Test {
    @Test
    public void Test_checkFibonacci(){
        assertEquals(new Exercise21().checkFibonacci(20),7);
        assertEquals(new Exercise21().checkFibonacci(50),9);
    }
}
