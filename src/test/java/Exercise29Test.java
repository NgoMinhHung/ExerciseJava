import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise29Test {
    @Test
    public void Test_convertRomanToDecimal(){
        assertEquals(new Exercise29().convertRomanToDecimal("DCCCXCV"), 895);
        assertEquals(new Exercise29().convertRomanToDecimal("CCXXVIII"), 228);
    }
}
