package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise10Test {
    @Test
    public void Test_calculatePi(){
        assertEquals(new Exercise10().calculatePi(), 3.141565741650993, 0.00001);
    }
}