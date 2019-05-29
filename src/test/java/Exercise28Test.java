import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise28Test {

    @Test
    public void Test_sqrt(){

        assertEquals(new Exercise28().sqrt(4),2, 0.0001);
        assertEquals(new Exercise28().sqrt(8),2.8284, 0.0001);
        assertEquals(new Exercise28().sqrt(25.25),5.0249, 0.0001);
    }
}
