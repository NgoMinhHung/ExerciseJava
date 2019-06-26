package arrays;

import arrays.Array21;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array21Test {

    @Test
    public void Test_calculateDeterminant(){
        assertEquals(new Array21().calculateDeterminant(1, new int[][]{{5}}),5);
        assertEquals(new Array21().calculateDeterminant(2, new int[][]{{1,2},{3,4}}),-2);
        assertEquals(new Array21().calculateDeterminant(4, new int[][]{{1, 0, 2, -1},{3, 0, 0, 5},{2, 1, 4, -3},{1, 0, 5, 0}}),30);
    }
}
