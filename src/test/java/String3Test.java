import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String3Test {

    @Test
    public void Test_isSymmetry(){
        assertEquals(new String3().isSymmetry("abcdcba"),true);
        assertEquals(new String3().isSymmetry(""),false);
        assertEquals(new String3().isSymmetry("Hung"),false);
        assertEquals(new String3().isSymmetry("issi"),true);
    }
}
