package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.Assert.assertEquals;

public class Array1Test {

    @Test
    public void Test_getDuplicateElements(){
        Assert.assertEquals(new Array1().getDuplicateElements(new int[]{1,3,5,6,3,7,9,9,5}),new ArrayList<>(Arrays.asList(3,5,9)));
        Assert.assertEquals(new Array1().getDuplicateElements(new int[]{1,3,6,3,4,7,9,4,6,10,54}), new ArrayList<>(Arrays.asList(3,4,6)));
    }

}
