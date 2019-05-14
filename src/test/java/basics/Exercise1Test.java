package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void test_gcd(){
        assertEquals(new Exercise1().gcd(3, 2), 1);
    }
    @Test
    public void test_lcm(){
        assertEquals(new Exercise1().lcm(3, 2), 6);
    }
}
