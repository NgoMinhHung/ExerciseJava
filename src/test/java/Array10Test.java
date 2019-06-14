import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Array10Test {

    @Test
    public void Test_devideEquallyElements(){
       assertArrayEquals(new Array10().devideEquallyElements(3,new int[]{1,2,3,4,5,6,7,8,9,10}),new int[][]{{1,2,3,4},{5,6,7,8},{9,10,0,0}});
        assertArrayEquals(new Array10().devideEquallyElements(15,new int[]{1,2,3,4,5,6,7,8,9,10}),null);
        assertArrayEquals(new Array10().devideEquallyElements(15,new int[]{}),null);
        assertArrayEquals(new Array10().devideEquallyElements(2,new int[]{1,2,3,4,5,6,7,8,9,10}),new int[][]{{1,2,3,4,5},{6,7,8,9,10}});
    }
}