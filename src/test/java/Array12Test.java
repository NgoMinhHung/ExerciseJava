import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array12Test {
    @Test
    public void Test_insertNumberIntoArrayAscending(){
        assertEquals(new Array12().insertNumberIntoArrayAscending(new int[]{1,6,2,4,98,3,6,54,32},11),new ArrayList<>(Arrays.asList(1,2,3,4,6,6,11,32,54,98)));
    }
}
