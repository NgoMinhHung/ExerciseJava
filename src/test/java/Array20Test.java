import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array20Test {

    @Test
    public void Test_getSubArray(){
        int [][]arr = {
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}};
        assertArrayEquals(new Array20().getSubArray(arr,1,1,3,3),new int[][]{{7,8,9},{12,13,14},{17,18,19}});
    }
    @Test
    public void Test_getSubArray2(){
        int [][]arr = {
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}};
        assertArrayEquals(new Array20().getSubArray(arr,1,1,5,3),null);
    }
    @Test
    public void Test_getSubArray3(){
        int [][]arr = {
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}};
        assertArrayEquals(new Array20().getSubArray(arr,1,1,3,5),null);
    }
    @Test
    public void Test_getSubArray4(){
        int [][]arr = {
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}};
        assertArrayEquals(new Array20().getSubArray(arr,1,1,5,5),null);
    }
    @Test
    public void Test_getSubArray5(){
        int[][] arr = {
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}};
        assertArrayEquals(new Array20().getSubArray(arr,1,1,2,3),new int[][]{{7,8,9},{12,13,14}});
    }

}
