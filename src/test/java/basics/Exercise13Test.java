import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise13Test {
    @Test
    public void Test_calculate(){
        assertEquals(new Exercise13().calulate(),2.71828f, 0.00001);
    }
}
