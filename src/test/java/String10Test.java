import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class String10Test {

    @Test
    public void Test_convert(){
        assertEquals(new String10().convert("abc4e6fd"),"abcccceeeeeefd");
        assertEquals(new String10().convert("ab13c"),"abbbbbbbbbbbbbc");
        assertEquals(new String10().convert("b15"),"bbbbbbbbbbbbbbb");
        assertEquals(new String10().convert("danv.-?"),"Error");
    }
}
