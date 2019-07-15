import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class OOP_Exercise7Test {

    @Test
    public void Test_enQueue(){
        OOP_Exercise7<Double> result = new OOP_Exercise7<>();
        assertTrue(result.isEmpty());
        result.enqueue(9.0);
        assertFalse(result.isEmpty());
    }
    @Test
    public void Test_deQueue(){
        OOP_Exercise7<Double> result = new OOP_Exercise7<>();
        assertNull(result.dequeue());
        result.enqueue(9.0);
        result.enqueue(5.1);
        assertEquals(result.dequeue(),9.0, 0.001);
    }
    @Test
    public void Test_isEmpty(){
        OOP_Exercise7<Double> result = new OOP_Exercise7<>();
        assertTrue(result.isEmpty());
    }
    @Test
    public void Test_front(){
        OOP_Exercise7<Double> result = new OOP_Exercise7<>();
        assertNull(result.front());
        result.enqueue(9.0);
        result.enqueue(10.5);
        result.enqueue(17.1);
        assertEquals(result.front(),9.0, 0.001);
    }
    @Test
    public void Test_size(){
        OOP_Exercise7<Double> result = new OOP_Exercise7<>();
        assertEquals(result.size(),0);
        result.enqueue(9.5);
        result.enqueue(11.1);
        result.enqueue(17.9);
        assertEquals(result.size(),3);
    }
}
