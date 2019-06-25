import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class String16Test {

    @Test
    public void Test_addString(){
        assertEquals(new String16().addString("234124asd","12331"),"Number Error");
        assertEquals(new String16().addString("234124","12xzc331"),"Number Error");
        assertEquals(new String16().addString("234124asd","1dsad2331"),"Number Error");
        assertEquals(new String16().addString("12345","123"),"12468");
        assertEquals(new String16().addString("23432","1124312331"),"1124335763");
        assertEquals(new String16().addString("1234","5679"),"6913");
    }
}
