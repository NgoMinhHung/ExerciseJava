import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Array5Test {

    @Test
    public void Test_isPrime(){
        assertEquals(new Array5().isPrime(5), true);
        assertEquals(new Array5().isPrime(4), false);
    }

    @Test
    public  void Test_sumPrimeNumbers(){
        assertEquals(new Array5().sumPrimeNumbers(new long[]{1,3,5,4,2,7,6,9,13,45}),30);
    }
}
