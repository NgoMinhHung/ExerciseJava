package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array3Test {

    @Test
    public void Test_sumEvenMinusOddNumbers(){
        Assert.assertEquals(new Array3().sumEvenMinusOddNumbers(new long[]{1,34,52,3,5,75,9,100,32}),125);
        Assert.assertEquals(new Array3().sumEvenMinusOddNumbers(new long[]{1,34,152,105,325,75,9,100,32}),-197);
    }
}
