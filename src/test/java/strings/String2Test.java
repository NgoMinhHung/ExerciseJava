package strings;

import org.junit.Test;
import strings.String2;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String2Test {

    @Test
    public void Test_getWords(){
        assertEquals(new String2().getWords("Hung danh bida co 102"), new ArrayList<String>(Arrays.asList("Hung","danh","bida","co","102")));
        assertEquals(new String2().getWords(""), new ArrayList<String>(){});
    }
}
