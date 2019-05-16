import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {
    String s = new String("1 1 2 3 5 8");
    String s1 = new String("1 1 2 3 5 8 13 21");
    @Test
    public void Test_Excercise5(){
        assertEquals(new Exercise5().fibonaci(9), s);
        assertEquals(new Exercise5().fibonaci(25), s1);
    }
}
