import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class OOP_Exercise6Test {

    @Test
    public void Test_push() {
        OOP_Exercise6<Double> result = new OOP_Exercise6<>();
        assertTrue(result.isEmpty());
        result.push(9.2);
        assertFalse(result.isEmpty());

    }

    @Test
    public void Test_pop() {
        OOP_Exercise6<Double> result = new OOP_Exercise6<>();
        assertNull(result.pop());
        result.push(9.0);
        result.push(5.5);
        assertEquals((double) result.pop(), 5.5,0.001);
    }

    @Test
    public void Test_isEmpty() {
        OOP_Exercise6<Double> result = new OOP_Exercise6<>();
        assertTrue(result.isEmpty());
    }
}
