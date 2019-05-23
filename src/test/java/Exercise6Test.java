import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Exercise6Test {
    @Test
    public void Test_Exercise6(){
        assertEquals(new Exercise6().solveQuadraticEquation(3, 4, 5),"vo nghiem");
        assertEquals(new Exercise6().solveQuadraticEquation(0, 0, 0),"vo so nghiem");
        assertEquals(new Exercise6().solveQuadraticEquation(0, 4, 5),"x= -1.25");
        assertEquals(new Exercise6().solveQuadraticEquation(5, 3, -8),"x1= -1.6 , x2= 1.0");
        assertEquals(new Exercise6().solveQuadraticEquation(1, -2, 1),"x= 1.0");
    }
}
