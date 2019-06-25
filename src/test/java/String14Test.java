import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class String14Test {

    @Test
    public void Test_isBarcode(){
        assertEquals(new String14().isBarcode("8938505974194"),true);
        assertEquals(new String14().isBarcode("8938505974193"),false);
        assertEquals(new String14().isBarcode("8938505974194324325"),false);
        assertEquals(new String14().isBarcode("89385059wab94"),false);
        assertEquals(new String14().isBarcode("8938edsdsf5059wab94"),false);
    }
}
