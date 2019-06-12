import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Array17Test {

    @Test
    public void Test_setSpiralArray(){
        assertArrayEquals(new Array17().setSpiralArray(5),new int[][]{{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}});
    }
}
