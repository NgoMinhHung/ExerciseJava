import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class String6Test {

    @Test
    public void Test_convertString(){
        assertEquals(new String6().convertString("HungQRFSAG"),"hUNGqrfsag");
        assertEquals(new String6().convertString("Hung OLAF"),"hUNG olaf");
        assertEquals(new String6().convertString(""),null);
        assertEquals(new String6().convertString("      "),null);
    }
}
