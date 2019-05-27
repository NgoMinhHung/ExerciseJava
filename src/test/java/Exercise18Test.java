import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise18Test {
    @Test
    public void Test_convertDecimalToBinary(){
        assertEquals(new Exercise18().convertDecimalToBinary(23),"10111");
        assertEquals(new Exercise18().convertDecimalToBinary(8),"1000");
    }
    @Test
    public void Test_convertBinaryToDecimal(){

    }
}
