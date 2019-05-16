import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Exercise6Test {
    String s = new String("vo nghiem");
    String s1 = new String("vo so nghiem");
    String s2 = new String("x= -1.25");
    String s3 = new String("x1= -1.6 x2= 1.0");
    @Test
    public void Test_Exercise6(){
        assertEquals(new Exercise6().solveQuadraticEquation(3, 4, 5),s);
        assertEquals(new Exercise6().solveQuadraticEquation(0, 0, 0),s1);
        assertEquals(new Exercise6().solveQuadraticEquation(0, 4, 5),s2);
        assertEquals(new Exercise6().solveQuadraticEquation(5, 3, -8),s3);
    }
}
