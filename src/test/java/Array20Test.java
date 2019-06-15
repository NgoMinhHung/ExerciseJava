import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Array20Test {

    @Test
    public void Test_getSubArray(){
        assertArrayEquals(new Array20().getSubArray(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}},1,1,3,3),new int[][]{{7,8,9},{12,13,14},{17,18,19}});
        assertArrayEquals(new Array20().getSubArray(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}},1,1,5,3),null);
        assertArrayEquals(new Array20().getSubArray(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}},1,1,3,5),null);
        assertArrayEquals(new Array20().getSubArray(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}},1,1,5,5),null);
        assertArrayEquals(new Array20().getSubArray(new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}},1,1,2,3),new int[][]{{7,8,9},{12,13,14}});
    }
}
