package arrays;

import arrays.Array6;
import org.junit.Test;

import static org.junit.Assert.*;

public class Array6Test {

    @Test
    public void Test_sortArray(){
        assertArrayEquals(new Array6().sortArray(new int[]{14, 11, 10, 6, 1, 4, 3, 2, 7, 9}), new int[]{2, 11, 4, 6, 9, 10, 7, 14, 3, 1});
        assertArrayEquals(new Array6().sortArray(new int[]{0,1,2,3,4,5,6,7,8,9,10}), new int[]{0,9,2,7,4,5,6,3,8,1,10});
    }
}