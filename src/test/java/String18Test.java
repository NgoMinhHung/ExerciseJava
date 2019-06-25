import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String18Test {

    @Test
    public void Test_multiply(){
        assertEquals(new String18().multiply("12saf345","123"), "Error Number");
        assertEquals(new String18().multiply("12345","1zxcxz23"), "Error Number");
        assertEquals(new String18().multiply("12sa45","1-23"), "Error Number");
        assertEquals(new String18().multiply("12345","123"), "1518435");
        assertEquals(new String18().multiply("123","12345"), "1518435");
        assertEquals(new String18().multiply("-123","12345"), "-1518435");
        assertEquals(new String18().multiply("123","-12345"), "-1518435");
        assertEquals(new String18().multiply("-123","-12345"), "1518435");
        assertEquals(new String18().multiply("00","12345"), "0");
        assertEquals(new String18().multiply("123","0"), "0");
        assertEquals(new String18().multiply("0","00"), "0");
    }
}
