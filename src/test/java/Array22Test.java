import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array22Test {

    @Test
    public void Test_deleteRowAndColumnOfMatrix(){
        assertArrayEquals(new Array22().deleteRowAndColumnOfMatrix(new int[][]{
                                                {1,     2,      3,      4,      5},
                                                {6,     7,      8,      9,      10},
                                                {11,    12,     13,     14,     15},
                                                {16,    17,     18,     19,     20}},
                                            3,3),new int[][]{
                                                    {1,     2,      4,      5},
                                                    {6,     7,      9,      10},
                                                    {16,    17,     19,     20}});
        assertArrayEquals(new Array22().deleteRowAndColumnOfMatrix(new int[][]{
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}},
                5,3),null);
        assertArrayEquals(new Array22().deleteRowAndColumnOfMatrix(new int[][]{
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}},
                3,6),null);

        assertArrayEquals(new Array22().deleteRowAndColumnOfMatrix(new int[][]{
                        {1,     2,      3,      4,      5},
                        {6,     7,      8,      9,      10},
                        {11,    12,     13,     14,     15},
                        {16,    17,     18,     19,     20}},
                10,10),null);
    }
}
