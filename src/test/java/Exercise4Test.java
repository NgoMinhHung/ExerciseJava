import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
    @Test
    public void Test_Exercise4(){
        assertEquals(new Exercise4().analysisOfPrimeNumberShort(600),"2^3 * 3 * 5^2");
        assertEquals(new Exercise4().analysisOfPrimeNumberShort(725),"5^2 * 29");
    }
}
