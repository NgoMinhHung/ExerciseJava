import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise19Test {
    @Test
    public void Test_printLineOfTrianglePascal(){
        assertEquals(new Exercise19().printLineOfTrianglePascal(3), "1 3 3 1");
        assertEquals(new Exercise19().printLineOfTrianglePascal(0), "1");
        assertEquals(new Exercise19().printLineOfTrianglePascal(5), "1 5 10 10 5 1");
    }
    @Test
    public void Test_calculateFactorial(){
        assertEquals(new Exercise19().calculateFactorial(3), 6);
        assertEquals(new Exercise19().calculateFactorial(5), 120);
    }
}
