import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String4Test {

    @Test
    public void Test_sumNumberInString(){
        assertEquals(new String4().sumNumberInString("abc 123 def 33 mn 3.221"),380);
        assertEquals(new String4().sumNumberInString(""),0);
    }
}
