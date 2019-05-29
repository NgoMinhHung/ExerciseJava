import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Exercise27Test {

    @Test
    public void Test_countZeroInFactorialOfNumber(){
        assertEquals(new Exercise27().countZeroInFactorialOfNumber(20), 4);
        assertEquals(new Exercise27().countZeroInFactorialOfNumber(100), 24);
        assertEquals(new Exercise27().countZeroInFactorialOfNumber(1000000), 249998);
    }
}
