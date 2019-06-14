package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Array4Test {
    
    @Test
    public void Test_sortArray(){
        Assert.assertEquals(new Array4().sortArray(new int[]{1,3,2,7,46,9,5,8,71,34,6,67}),new ArrayList<>(Arrays.asList(2,6,8,34,46,71,67,9,7,5,3,1)));
    }
}
