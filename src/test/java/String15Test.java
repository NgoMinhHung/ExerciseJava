import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class String15Test {

    @Test
    public void Test_getnumberVerify(){
        assertEquals(new String15().getnumberVerify("893850597419"),4);
        assertEquals(new String15().getnumberVerify("893957597419"),0);
        assertEquals(new String15().getnumberVerify("8-d850597419"),-1);
        assertEquals(new String15().getnumberVerify("8safsafd9719"),-1);
    }
}
