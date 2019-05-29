import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise24Test {
    @Test
    public void Test_checkFibonacci(){
        assertEquals(new Exercise24().checkFibonacci(20),7);
        assertEquals(new Exercise24().checkFibonacci(50),9);
        assertEquals(new Exercise24().checkFibonacci(1),2);
        assertEquals(new Exercise24().checkFibonacci(0),0);
    }
}
