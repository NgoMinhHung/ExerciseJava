import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array14Test {

    @Test
    public void Test_convertTwoDimensionalArraytoOneDimensionalArray(){
        assertEquals(new Array14().convertTwoDimensionalArraytoOneDimensionalArray(3,5, new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}}), new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10,15,14,13,12,11,6,7,8,9)));
        assertEquals(new Array14().convertTwoDimensionalArraytoOneDimensionalArray(0,5, new int[][]{{}}), new ArrayList<Integer>(Arrays.asList()));
        assertEquals(new Array14().convertTwoDimensionalArraytoOneDimensionalArray(3,0, new int[][]{{}}), new ArrayList<Integer>(Arrays.asList()));
        assertEquals(new Array14().convertTwoDimensionalArraytoOneDimensionalArray(0,0, new int[][]{{}}), new ArrayList<Integer>(Arrays.asList()));
        assertEquals(new Array14().convertTwoDimensionalArraytoOneDimensionalArray(1,5, new int[][]{{1,2,3,4,5}}), new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
        assertEquals(new Array14().convertTwoDimensionalArraytoOneDimensionalArray(3,1, new int[][]{{1},{6},{11}}), new ArrayList<Integer>(Arrays.asList(1,6,11)));
    }
}
