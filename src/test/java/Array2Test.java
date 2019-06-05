import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array2Test {

    @Test
    public void Test_sumThreeLargestNumbers(){
        assertEquals(new Array2().sumThreeLargestNumbers(new long[]{2,4,7,3,54,3,8}),69);
        assertEquals(new Array2().sumThreeLargestNumbers(new long[]{2,30,7,15,54,3,9}),99);
    }
}
