package basics;

import basics.Exercise9;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise9Test {
    @Test
    public void Test_calculatePi(){
        assertTrue(Math.abs(new Exercise9().calculatePi() - 3.1414926535900345) < 0.0001);
    }
}