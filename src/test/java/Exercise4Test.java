import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
    String s = new String("2^3 * 3 * 5^2");
    String s1 = new String("5^2 * 29");
    @Test
    public void Test_Exercise4(){
        assertEquals(new Exercise4().analysisOfPrimeNumberShort(600),s);
        assertEquals(new Exercise4().analysisOfPrimeNumberShort(725),s1);
    }
}
