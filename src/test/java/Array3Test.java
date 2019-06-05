import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array3Test {

    @Test
    public void Test_sumEvenMinusOddNumbers(){
        assertEquals(new Array3().sumEvenMinusOddNumbers(new long[]{1,34,52,3,5,75,9,100,32}),125);
        assertEquals(new Array3().sumEvenMinusOddNumbers(new long[]{1,34,152,105,325,75,9,100,32}),-197);
    }
}
