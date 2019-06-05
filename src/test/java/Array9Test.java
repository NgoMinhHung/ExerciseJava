import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array9Test {
    @Test
    public void Test_binarySearch(){
        assertEquals(new Array9().binarySearch(new int[]{1,3,6,31,45,64,78,32,65,35},0,9,35),5);
        assertEquals(new Array9().binarySearch(new int[]{1,3,6,31,45,64,78,32,65,35},0,9,100),-1);
    }
}
