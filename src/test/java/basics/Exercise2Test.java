package basics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise2Test {
    @Test
    public void Test_calculateSumOfDigits(){
        Assert.assertEquals(new Exercise2().calculateSumOfDigits(1234), 10);
    }
}
