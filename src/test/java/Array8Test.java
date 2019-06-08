import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array8Test {
    @Test
    public void Test_getMaximumDifferenceAndSmallestNumber(){
        assertEquals(new Array8().getMaximumDifferenceAndSmallestNumber(new long[]{2,1,65,2,98,5,3,8,400,32,76,82}),399);
    }
}
