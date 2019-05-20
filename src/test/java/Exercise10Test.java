import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Exercise10Test {
    @Test
    public void Test_Exercise10(){
        assertTrue(Math.abs(new Exercise10().calculatePi() - 3.1416926635905345) < 0.00001);
    }
}
