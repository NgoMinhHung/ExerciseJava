import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array26Test {

    @Test
    public void Test_reverse(){
        assertEquals(new Array26().reverse(234),432);
    }
    @Test
    public void Test_sumNumberReverseOfArray(){
        assertEquals(new Array26().sumNumberReverseOfArray(new int[]{1,2,3,4,5,12,15,18}),168);
    }
}
