package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise18Test {
    @Test
    public void Test_reverseBits(){
        assertEquals(new Exercise18().reverseBits(23),29);
        assertEquals(new Exercise18().reverseBits(8),1);
    }
}
