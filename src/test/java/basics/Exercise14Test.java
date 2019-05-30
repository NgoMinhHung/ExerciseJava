package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise14Test {
    @Test
    public void Test_sqrt(){
        assertEquals(new Exercise14().sqrt(9),3,0.0001);
    }
}
