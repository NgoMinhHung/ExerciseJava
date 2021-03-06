package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array9Test {
    @Test
    public void Test_binarySearch(){
        Assert.assertEquals(new Array9().binarySearch(new int[]{1,3,6,31,32,35,45,64,65,78},35),5);
        Assert.assertEquals(new Array9().binarySearch(new int[]{1,3,6,31,32,35,45,64,65,78},100),-1);
        Assert.assertEquals(new Array9().binarySearch(new int[]{1,3,6,31,32,35,45,64,65,78},33),-1);
        Assert.assertEquals(new Array9().binarySearch(new int[]{1,3,6,31,32,35,45,64,65,78}, -5),-1);
        Assert.assertEquals(new Array9().binarySearch(new int[]{},100),-1);
    }
}