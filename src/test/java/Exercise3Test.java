import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {
    String s = new String("2 * 2 * 2 * 3 * 5 * 5");
    String s1 = new String("2 * 2 * 5 * 7");
    @Test
    public void Test_Exercise3(){
        assertEquals(new Exercise3().analysisOfPrimeNumber(600),s);
        assertEquals(new Exercise3().analysisOfPrimeNumber(140),s1);
    }
}
