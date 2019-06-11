import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array7Test {

    @Test
    public void Test_getPositionElementMaximum(){
        assertEquals(new Array7().getPositionElementMaximum(new int[]{6,9,3,5,7,0,12,23}),7);
    }
    @Test
    public void Test_getLongestArrayOfChildren(){
        assertEquals(new Array7().getLongestArrayOfChildren(new int[]{2,1,5,3,6,7,8,9,4,3}), new ArrayList<Integer>(Arrays.asList(3,6,7,8,9)));
    }
}
