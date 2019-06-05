import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Array1Test {

    @Test
    public void Test_getDuplicateElements(){
        assertEquals(new Array1().getDuplicateElements(new int[]{1,3,5,6,3,7,9,5,4},new ArrayList<Integer>(Arrays.asList(3,5))));
        assertEquals(new Array1().getDuplicateElements(new int[]{1,3,5,6,3,7,9,9,5},new ArrayList<Integer>(Arrays.asList(3,5,9))));
    }

}
