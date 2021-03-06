package arrays;

import arrays.Array17;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Array17Test {

    @Test
    public void Test_setSpiralArray() {
        assertArrayEquals(new Array17().setSpiralArray(5), new int[][]{ {1, 2, 3, 4, 5},
                                                                        {16, 17, 18, 19, 6},
                                                                        {15, 24, 25, 20, 7},
                                                                        {14, 23, 22, 21, 8},
                                                                        {13, 12, 11, 10, 9}});
        assertArrayEquals(new Array17().setSpiralArray(0), new int[][]{});
        assertArrayEquals(new Array17().setSpiralArray(1), new int[][]{{1}});
        assertArrayEquals(new Array17().setSpiralArray(2), new int[][]{ {1, 2},
                                                                        {4, 3}});
        assertArrayEquals(new Array17().setSpiralArray(3), new int[][]{ {1, 2, 3},
                                                                        {8, 9, 4},
                                                                        {7, 6, 5}});
        assertArrayEquals(new Array17().setSpiralArray(4), new int[][]{ {1, 2, 3, 4},
                                                                        {12, 13, 14, 5},
                                                                        {11, 16, 15, 6},
                                                                        {10, 9, 8, 7}});
    }
}
