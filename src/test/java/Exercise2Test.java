import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
    @Test
    public void Test_calculateSumOfDigits(){
        assertEquals(new Exercise2().calculateSumOfDigits(1234), 10);
    }
}
