import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array19Test {

    @Test
    public void Test_sortSpiralMatrix(){
        assertArrayEquals(new Array19().sortSpiralMatrix(new int[][]{
                                    {5,     2,      4,      1,      3},
                                    {6,     9,      8,      7,      10},
                                    {14,    12,     13,     15,     11}}),
                new int[][]{
                            {1,     2,      3,      4,      5},
                            {12,    13,     14,     15,     6},
                            {11,    10,     9,      8,      7}});
        assertArrayEquals(new Array19().sortSpiralMatrix(new int[][]{}),new int[][]{});
        assertArrayEquals(new Array19().sortSpiralMatrix(new int[][]{
                                                {5,     2,      4,      1,      3}}),
                new int[][]{
                            {1,     2,      3,      4,      5}});
        assertArrayEquals(new Array19().sortSpiralMatrix(new int[][]{
                            {5},
                            {6},
                            {14}}),
                new int[][]{
                            {5},
                            {6},
                            {14}});

    }
    @Test
    public void Test_convertMatrixOneDimentionalArray(){
        assertArrayEquals(new Array19().convertMatrixOneDimentionalArray(new int[][]{{1,2,3},{4,5,6}}),new int[]{1,2,3,4,5,6});
    }

}
