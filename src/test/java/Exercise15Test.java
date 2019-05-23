import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise15Test {
    @Test
    public void Test_CheckTriangle(){
        assertEquals(new Exercise15().checkTriangle(3,4,5), "La tam giac hop le\nChu vi: 12\nLa tam giac vuong");
        assertEquals(new Exercise15().checkTriangle(1,2,3), "3 canh khong hop le");
        assertEquals(new Exercise15().checkTriangle(6,6,6), "La tam giac hop le\nChu vi: 18\nLa tam giac deu");
        assertEquals(new Exercise15().checkTriangle(3,3,4), "La tam giac hop le\nChu vi: 10\nLa tam giac can");
    }
}