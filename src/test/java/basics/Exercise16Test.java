package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise16Test {
    @Test
    public void Test_getParameterOfTriangle(){
        assertEquals(new Exercise16().getParameterOfTriagle(0,3,0,0,4,0), "La tam giac vuong\nChu vi: 12.0\nDien tich: 6.0" );
          assertEquals(new Exercise16().getParameterOfTriagle(-3, 0, 0, 3 * Math.sqrt(3), 3, 0), "La tam giac deu\nChu vi: 18.0\nDien tich: 15.588457268119896" );
        assertEquals(new Exercise16().getParameterOfTriagle(0,4,-3,0,3,0), "La tam giac can\nChu vi: 16.0\nDien tich: 12.0" );
        assertEquals(new Exercise16().getParameterOfTriagle(0,3,0,0,0,4), "Khong phai tam giac" );
        assertEquals(new Exercise16().getParameterOfTriagle(-3,3,0,0,4,6), "La tam giac thuong\nChu vi: 19.06951634391117\nDien tich: 14.999999999999998" );

    }
    @Test
    public  void Test_findTypeOfTriangle(){
        assertEquals(new Exercise16().findTypeOfTriangle(1,3,3),"La tam giac can");
        assertEquals(new Exercise16().findTypeOfTriangle(3,4,4),"La tam giac can");
        assertEquals(new Exercise16().findTypeOfTriangle(3,1,3),"La tam giac can");
        assertEquals(new Exercise16().findTypeOfTriangle(5,1,5),"La tam giac can");
        assertEquals(new Exercise16().findTypeOfTriangle(6,6,6),"La tam giac deu");
    }
}
