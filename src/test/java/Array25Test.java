import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array25Test {

    @Test
    public void Test_getGreatestCommonDivisorOfArray(){
        assertEquals(new Array25().getGreatestCommonDivisorOfArray(new int[]{5,10,15,20}),5);
        assertEquals(new Array25().getGreatestCommonDivisorOfArray(new int[]{16,12,13,7}),1);
    }
}
