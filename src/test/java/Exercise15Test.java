import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise15Test {
    @Test
    public void Test_CheckTriangle(){
        assertEquals(new Exercise15().checkTriangle(3,4,5), "La tam giac vuong\nChu vi: 12");
        assertEquals(new Exercise15().checkTriangle(5,4,3), "La tam giac vuong\nChu vi: 12");
        assertEquals(new Exercise15().checkTriangle(4,5,3), "La tam giac vuong\nChu vi: 12");
        assertEquals(new Exercise15().checkTriangle(1,2,3), "3 canh khong hop le");
        assertEquals(new Exercise15().checkTriangle(6,6,6), "La tam giac deu\nChu vi: 18");
        assertEquals(new Exercise15().checkTriangle(3,3,4), "La tam giac can\nChu vi: 10");
        assertEquals(new Exercise15().checkTriangle(5,4,4), "La tam giac can\nChu vi: 13");
        assertEquals(new Exercise15().checkTriangle(5,7,5), "La tam giac can\nChu vi: 17");
        assertEquals(new Exercise15().checkTriangle(5,6,7), "La tam giac thuong\nChu vi: 18");

    }
}