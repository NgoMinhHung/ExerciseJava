import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class String5Test {
    @Test
    public void Test_getDuplicateWords(){
        assertEquals(new String5().getDuplicateWords("Hung abc 123 di den noi abc r di"),new ArrayList<String>(Arrays.asList("abc","di")));
        assertEquals(new String5().getDuplicateWords("Hung Hung Hung Hung"),new ArrayList<String>(Arrays.asList("Hung")));
        assertEquals(new String5().getDuplicateWords("Hung abc 123 di den noi"),new ArrayList<String>(Arrays.asList()));
        assertEquals(new String5().getDuplicateWords(""),new ArrayList<String>(Arrays.asList()));
    }
}
