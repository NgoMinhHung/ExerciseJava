import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array13Test {
    @Test
    public void Test_rotateTowDimensionalArray(){
        assertEquals(new Array13().rotateTowDimensionalArray(2,3, new int[][]{{1,2,3},{4,5,6}}), new int[][]{{4,1},{5,2},{6,3}});
    }
}
