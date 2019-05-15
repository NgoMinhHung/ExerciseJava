package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void test_calculateGreatestCommonDivisor(){
        assertEquals(new Exercise1().calculateGreatestCommonDivisor(1, 0), 1);
        assertEquals(new Exercise1().calculateGreatestCommonDivisor(0, 1), 1);
        assertEquals(new Exercise1().calculateGreatestCommonDivisor(0, 0), 0);
        assertEquals(new Exercise1().calculateGreatestCommonDivisor(7, 35), 7);
        assertEquals(new Exercise1().calculateGreatestCommonDivisor(23, 75), 1);
    }

    @Test
    public void test_calculateLeastCommonMultiple(){
        assertEquals(new Exercise1().calculateLeastCommonMultiple(15, 25), 75);
        assertEquals(new Exercise1().calculateLeastCommonMultiple(23, 75), 1725);
    }
}
