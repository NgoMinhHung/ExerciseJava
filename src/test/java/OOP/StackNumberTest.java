package OOP;

import OOP.StackNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackNumberTest {

    @Test
    public void Test_push() {
        StackNumber<Integer> result = new StackNumber<>();
        assertTrue(result.isEmpty());
        result.push(9);
        assertFalse(result.isEmpty());

    }

    @Test
    public void Test_pop() {
        StackNumber<Integer> result = new StackNumber<>();
        assertNull(result.pop());
        result.push(9);
        result.push(5);
        assertEquals((int) result.pop(), 5);
    }

    @Test
    public void Test_isEmpty() {
        StackNumber<Integer> result = new StackNumber<>();
        assertTrue(result.isEmpty());
    }
}
