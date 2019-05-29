package basics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
    @Test
    public void Test_Exercise4(){
        Assert.assertEquals(new Exercise4().analysisOfPrimeNumberShort(600),"2^3 * 3 * 5^2");
        Assert.assertEquals(new Exercise4().analysisOfPrimeNumberShort(725),"5^2 * 29");
    }
}
