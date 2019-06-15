package arrays;

import arrays.Array24;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array24Test {

    @Test
    public void Test_getLeastCommonMultiple(){
        assertEquals(new Array24().getLeastCommonMultiple(new int[]{5,10,15,20}),60);
        assertEquals(new Array24().getLeastCommonMultiple(new int[]{15,30,12,10}),60);
    }
    @Test
    public void Test_getGreatestCommonDivisor(){
        assertEquals(new Array24().getGreatestCommonDivisor(0, 5),5);
    }
}
