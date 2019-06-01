import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise15Test {
    @Test
    public void Test_CheckTriangle(){
        assertEquals(new Exercise15().getParameterOfTriangle(3,4,5), "La tam giac vuong\nChu vi: 12.0\nDien tich: 6.0");
        assertEquals(new Exercise15().getParameterOfTriangle(5,4,3), "La tam giac vuong\nChu vi: 12.0\nDien tich: 6.0");
        assertEquals(new Exercise15().getParameterOfTriangle(4,5,3), "La tam giac vuong\nChu vi: 12.0\nDien tich: 6.0");
        assertEquals(new Exercise15().getParameterOfTriangle(1,2,3), "Khong phai tam giac");
        assertEquals(new Exercise15().getParameterOfTriangle(6,6,6), "La tam giac deu\nChu vi: 18.0\nDien tich: 15.588457268119896");
        assertEquals(new Exercise15().getParameterOfTriangle(3,3,4), "La tam giac can\nChu vi: 10.0\nDien tich: 4.47213595499958");
        assertEquals(new Exercise15().getParameterOfTriangle(5,7,5), "La tam giac can\nChu vi: 17.0\nDien tich: 12.497499749949988");
        assertEquals(new Exercise15().getParameterOfTriangle(5,6,7), "La tam giac thuong\nChu vi: 18.0\nDien tich: 14.696938456699069");

    }
}