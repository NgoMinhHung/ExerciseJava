package basics;

import basics.Exercise11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise11Test {
    @Test
    public void Test_calculateInterest(){
        assertEquals(new Exercise11().calculateInterest(4),244.140625,0.000001);
    }
}