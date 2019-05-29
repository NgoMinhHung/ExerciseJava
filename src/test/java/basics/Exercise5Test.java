package basics;

import basics.Exercise5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {
    @Test
    public void Test_Excercise5(){
        assertEquals(new Exercise5().fibonaci(9), "1 1 2 3 5 8");
        assertEquals(new Exercise5().fibonaci(25), "1 1 2 3 5 8 13 21");
    }
}
