import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array23Test {

    @Test
    public void Test_greatestSum(){
        assertEquals(new Array23().greatestSum(new int[]{0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}),18);
    }
}
