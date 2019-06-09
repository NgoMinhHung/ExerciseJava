import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Array10Test {

    @Test
    public void Test_devideEquallyElements(){
       assertArrayEquals(new Array10().devideEquallyElements(3,new int[]{1,2,3,4,5,6,7,8,9,10}),new ArrayList<Integer>().toArray(){[1,2,3,4],[5,6,7,8],[9,10]});
//        assertEquals(new Array10().devideEquallyElements(15,new int[]{1,2,3,4,5,6,7,8,9,10}),new int[][]{});
//        assertArrayEquals(new Array10().devideEquallyElements(3, new int[]{1,2,3,4,5,6,7,8,9,10}),new ArrayList<ArrayList<Integer>>()(Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(5,6,7,8),Arrays.asList(9,10)));
   //     assertArrayEquals(new Array10().devideEquallyElements(3,new int[]{1,2,3,4,5,6,7,8,9,10}),);
    }
}