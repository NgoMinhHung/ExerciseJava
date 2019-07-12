package OOP;

import OOP.QueueNumber;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class QueueNumberTest {

    @Test
    public void Test_enQueue(){
        QueueNumber<Integer> result = new QueueNumber<>();
        assertTrue(result.isEmpty());
        result.enqueue(9);
        assertFalse(result.isEmpty());
    }
    @Test
    public void Test_deQueue(){
        QueueNumber<Integer> result = new QueueNumber<>();
        assertNull(result.dequeue());
        result.enqueue(9);
        result.enqueue(5);
        assertEquals((int) result.dequeue(),9);
    }
    @Test
    public void Test_isEmpty(){
        QueueNumber<Integer> result = new QueueNumber<>();
        assertTrue(result.isEmpty());
    }
    @Test
    public void Test_front(){
        QueueNumber<Integer> result = new QueueNumber<>();
        assertNull(result.front());
        result.enqueue(9);
        result.enqueue(10);
        result.enqueue(17);
        assertEquals((int)result.front(),9);
    }
    @Test
    public void Test_size(){
        QueueNumber<Integer> result = new QueueNumber<>();
        assertEquals(result.size(),0);
        result.enqueue(9);
        result.enqueue(11);
        result.enqueue(17);
        assertEquals(result.size(),3);
    }
}
