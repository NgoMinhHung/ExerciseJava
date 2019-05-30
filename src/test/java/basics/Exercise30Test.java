package basics;

import basics.Exercise30;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise30Test {
    @Test
    public void Test_convertRomanToDecimal(){
        assertEquals(new Exercise30().converRomantoDecimal(228), "CCXXVIII");
        assertEquals(new Exercise30().converRomantoDecimal(10), "X");
        assertEquals(new Exercise30().converRomantoDecimal(9), "IX");
    }
}
