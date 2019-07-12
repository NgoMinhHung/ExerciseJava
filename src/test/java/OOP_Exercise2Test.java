import OOP_Exercise2.Circle;
import OOP_Exercise2.Quadrilateral;
import OOP_Exercise2.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OOP_Exercise2Test {

    @Test
    public void Test_showInfo(){
        assertEquals(new Triangle(0,3,0,0,4,0).showInfo(),"Dien tich: 6.0 chu vi: 12.0");
        assertEquals(new Triangle(0,3,0,0,0,4).showInfo(),"Error value");
        assertEquals(new Circle(0, 0, 6).showInfo(),"Dien tich: 113.09733552923255 Chu vi: 37.69911184307752");
        assertEquals(new Circle(0, 0, -6).showInfo(),"Error value");
        assertEquals(new Quadrilateral(0,0,0,1,2,0,3,-1).showInfo(),"Dien tich: 2.0 Chu vi: 7.812559200041264");
        assertEquals(new Quadrilateral(-1,0,0,0,0,4,0,4).showInfo(),"Error value");
        assertEquals(new Quadrilateral(0,4,-1,0,0,0,0,4).showInfo(),"Error value");
        assertEquals(new Quadrilateral(0,4,0,4,-1,0,0,0).showInfo(),"Error value");
        assertEquals(new Quadrilateral(0,0,0,4,0,4,-1,0).showInfo(),"Error value");
    }
    @Test
    public void Test_getArea(){
        assertEquals(new Triangle(0,3,0,0,4,0).getArea(),6.0,0.001);
        assertEquals(new Circle(0, 0, 6).getArea(),113.097,0.001);
        assertEquals(new Quadrilateral(0,0,0,1,2,0,3,-1).getArea(),2.0,0.001);
    }
    @Test
    public void Test_getPerimeter(){
        assertEquals(new Triangle(0,3,0,0,4,0).getPerimeter(),12.0,0.001);
        assertEquals(new Circle(0, 0, 6).getPerimeter(),37.699,0.001);
        assertEquals(new Quadrilateral(0,0,0,1,2,0,3,-1).getPerimeter(),7.813,0.001);
    }
}
