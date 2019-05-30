import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise25Test {

    @Test
    public void Test_checkFibonacci(){
        assertEquals(new Exercise25().checkFibonacci(3,1),4);
        assertEquals(new Exercise25().checkFibonacci(5,0),5);
        assertEquals(new Exercise25().checkFibonacci(21,2),6);
    }
}
