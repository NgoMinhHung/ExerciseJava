package strings;

import org.junit.Test;
import strings.String7;

import static junit.framework.TestCase.assertEquals;

public class String7Test {

    @Test
    public void Test_getIndexSubString(){
        assertEquals(new String7().getIndexSubString("Hung abc xyz efg hik","xyz"),9);
        assertEquals(new String7().getIndexSubString("Hung abc xyz efg hik","Hung"),0);
        assertEquals(new String7().getIndexSubString("Hung abc xyz efg hik","mnp"),-1);
        assertEquals(new String7().getIndexSubString("Hung aaabaabc xyz efg hik","abc"),10);
    }
}
