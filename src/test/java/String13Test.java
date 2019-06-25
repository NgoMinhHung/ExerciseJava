import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class String13Test {

    @Test
    public void Test_isEqualsubString(){
        assertEquals(new String13().isEqualsubString("abc","bbacab"),true);
        assertEquals(new String13().isEqualsubString("abc","bbacabfds"),false);
        assertEquals(new String13().isEqualsubString("abcabcabcabc","bbacab"),true);
        assertEquals(new String13().isEqualsubString("abcrd","bbacab"),false);
    }
}
