package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void test_calculateGreatestCommonDivisor(){
        assertEquals(new Exercise1().calculateGreatestCommonDivisor(7, 35), 7);
    }
    @Test
    public void test_calculateLeastCommonMultiple(){
        assertEquals(new Exercise1().calculateLeastCommonMultiple(15, 25), 75);
    }
}
