import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Exercise26Test {

    @Test
    public void Test_findNumberCrazyFibonacci(){
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(0, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))),-1);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(1, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))),1);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(3, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))),3);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(4, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))),4);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(5, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))),5);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(7, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))),9);
        assertEquals(new Exercise26().fineNumberCrazyFibonacci(10, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))),4);
    }
}
