package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise12Test {
    @Test
    public void Test_calculateExpresstion(){
       assertEquals(new Exercise12().calculateExpresstion(5),2.7167f,0.0001);
    }
}