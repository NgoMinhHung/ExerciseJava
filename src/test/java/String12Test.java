import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class String12Test {

    @Test
    public void Test_deleteDuplicateElements(){
        assertEquals(new String12().deleteDuplicateElements("abbbbbbccccd eeffffddbc"),"abcd efdbc");
        assertEquals(new String12().deleteDuplicateElements("abbbbbb?!-=ccccd eeffffddbc"),"Error");
        assertEquals(new String12().deleteDuplicateElements(""),"Error");
    }
}
