import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise26Test {
    @Test
    public void Test_findNumberCrazyFibonacci(){
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 0), -1);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 1), 1);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 2), 2);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 3), 3);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 4), 4);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 5), 5);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 7), 9);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, 2, 3, 4,5, 10), 4);
    }
}
