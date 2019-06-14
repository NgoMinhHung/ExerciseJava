package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array7Test {

    @Test
    public void Test_getLongestArrayOfChildren(){
        Assert.assertEquals(new Array7().getLongestArrayOfChildren(new int[]{2,1,5,3,6,7,8,9,4,3}), new ArrayList<Integer>(Arrays.asList(3,6,7,8,9)));
        Assert.assertEquals(new Array7().getLongestArrayOfChildren(new int[]{1,2,3,4,5,6,7,8,9}), new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
    }
}
