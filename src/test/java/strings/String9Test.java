package strings;

import org.junit.Test;
import strings.String9;

import static junit.framework.TestCase.assertEquals;

public class String9Test {

    @Test
    public void Test_convert(){
        assertEquals(new String9().convert("abcccceeeeeefd"),"abc4e6fd");
        assertEquals(new String9().convert("abbbbbbbbbbbbbc"),"ab13c");
        assertEquals(new String9().convert("bbbbbbbbbbbbbbb"),"b15");
        assertEquals(new String9().convert("abc21sda1"),"Error");
    }
}
