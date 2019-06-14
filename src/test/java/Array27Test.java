import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array27Test {

    @Test
    public void Test_getNumbersMaximunOfArray(){
        assertEquals(new Array27().getNumbersMaximunOfArray(5, new int[]{4,6,9,4,8,10,0,5,6,13,20}), new ArrayList<Integer>(Arrays.asList(8,9,10,13,20)));
    }
}