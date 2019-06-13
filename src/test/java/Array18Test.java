import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Array18Test {

    @Test
    public void Test_convertIntoOneDimentionalArray(){
        assertArrayEquals(new Array18().convertMatrixOneDimentionalArray(2,3,new int[][]{{1,2,3},{4,5,6}}),new int[]{1,2,3,4,5,6});
    }
    @Test
    public void Test_sortTowDimentionalArray(){
        assertArrayEquals(new Array18().sortMatrix(3,5,new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}}), new int[][]{{5,4,3,2,1},{10,9,8,7,6},{15,14,13,12,11}});
    }
}
