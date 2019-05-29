package basics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise5Test {
    @Test
    public void Test_Excercise5(){
        Assert.assertEquals(new Exercise5().fibonaci(9), "1 1 2 3 5 8");
        Assert.assertEquals(new Exercise5().fibonaci(25), "1 1 2 3 5 8 13 21");
    }
}
