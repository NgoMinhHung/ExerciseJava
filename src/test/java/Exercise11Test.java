import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise11Test {
    @Test
    public void Test_Exercise11(){
        assertTrue(Math.abs(new Exercise11().calculateInterest(4) - 244.140625) == 0);
    }
}
