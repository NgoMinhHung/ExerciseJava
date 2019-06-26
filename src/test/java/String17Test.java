import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class String17Test {

    @Test
    public void Test_subStringNumber(){

        assertEquals(new String17().subStringNumber("234124asd","12331"),"Number Error");
        assertEquals(new String17().subStringNumber("234124","12xzc331"),"Number Error");
        assertEquals(new String17().subStringNumber("234124asd","1dsad2331"),"Number Error");
        assertEquals(new String17().subStringNumber("234124","123"),"234001");
        assertEquals(new String17().subStringNumber("123","12331"),"-87792");
        assertEquals(new String17().subStringNumber("234124","123321"),"110803");
        assertEquals(new String17().subStringNumber("123321","234124"),"-110803");
        assertEquals(new String17().subStringNumber("223321","234124"),"-10803");
    }
}
