import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TriangleTest {
    @Test
    public void Test_getEdge(){
        assertEquals(new Triangle(0,3,0,0,4,0).getEdge(0,3,0,0),3,0.01);
    }
    @Test
    public void Test_checkTriangle(){
        assertTrue(new Triangle(0, 3, 0, 0, 4, 0).checkTriangle());
    }
    @Test
    public void Test_getPerimeter(){
        assertEquals(new Triangle(0,3,0,0,4,0).getPerimeter(), 12,0.001);
    }
    @Test
    public void Test_getArea(){
        assertEquals(new Triangle(0,3,0,0,4,0).getArea(),6,0.001);
    }
    @Test
    public void Test_getType(){
        assertEquals(new Triangle(0,3,0,0,4,0).getType(),"La tam giac vuong");
        assertEquals(new Triangle(-3, 0, 0, 3 * Math.sqrt(3), 3, 0).getType(),"La tam giac deu");
        assertEquals(new Triangle(0,4,-3,0,3,0).getType(),"La tam giac can");
        assertEquals(new Triangle(0,3,0,0,0,4).getType(),"Khong phai tam giac");
        assertEquals(new Triangle(-3,3,0,0,4,6).getType(),"La tam giac thuong");
    }
}
