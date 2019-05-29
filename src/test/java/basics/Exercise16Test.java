package basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise16Test {
    @Test
    public void Test_checkTriangle(){
        assertEquals(new Exercise16().checkTriangle(0,3,0,0,4,0), "La tam giac vuong\nChu vi: 12.0" );
        //assertEquals(new Exercise16().checkTriangle(), "La tam giac deu\nChu vi: 18.0" );
        assertEquals(new Exercise16().checkTriangle(0,4,-3,0,3,0), "La tam giac can\nChu vi: 16.0" );
        assertEquals(new Exercise16().checkTriangle(0,3,0,0,0,4), "3 canh khong hop le" );
        assertEquals(new Exercise16().checkTriangle(-3,3,0,0,4,6), "La tam giac thuong\nChu vi: 19.06951634391117" );

    }
}
