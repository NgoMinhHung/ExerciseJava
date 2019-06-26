package strings;

import org.junit.Test;
import strings.String8;

import static junit.framework.TestCase.assertEquals;

public class String8Test {

    @Test
    public void Test_standardized(){
        assertEquals(new String8().Standardized("hung Is Best Kaisaa vinh Bac Bo . and you ?cau ,cau so truong champ nao "),"Hung is best kaisaa vinh bac bo. And you? Cau, cau, Cau so truong champ nao");
        assertEquals(new String8().Standardized(""),"");
        assertEquals(new String8().Standardized("hung"),"Hung");
    }
}
