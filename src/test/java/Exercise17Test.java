import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise17Test {
    @Test
    public void Test_findInteger(){
        assertArrayEquals(new Exercise17().findInteger(999999).toArray(),new Integer[]
                { 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084,548834});
        assertEquals(new Exercise17().countNumber(371),3);
        assertEquals(new Exercise17().check(407),true);
    }
    @Test
    public  void Test_check(){
        assertEquals(new Exercise17().check(370), true);
        assertEquals(new Exercise17().check(371), true);
    }
    @Test
    public void Test_countNumber(){
        assertEquals(new Exercise17().countNumber(407),3);
    }
}
