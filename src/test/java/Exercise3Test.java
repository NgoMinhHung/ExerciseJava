import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise3Test {

    @Test
    public void Test_Exercise3(){
        assertEquals(new Exercise3().analysisOfPrimeNumber(600),"2 * 2 * 2 * 3 * 5 * 5");
        assertEquals(new Exercise3().analysisOfPrimeNumber(140),"2 * 2 * 5 * 7");
    }
}
