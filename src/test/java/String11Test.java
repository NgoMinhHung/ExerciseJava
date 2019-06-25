import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String11Test {

    @Test
    public void Test_calculateExpression(){
        assertEquals(new String11().calculateExpression(""),null);
        assertEquals(new String11().calculateExpression("3210/10"),"321");
        assertEquals(new String11().calculateExpression("3210+10"),"3220");
        assertEquals(new String11().calculateExpression("3210*10"),"32100");
        assertEquals(new String11().calculateExpression("3210-10"),"3200");
        assertEquals(new String11().calculateExpression("2^5"),"32.0");
        assertEquals(new String11().calculateExpression("10<<2"),"40");
        assertEquals(new String11().calculateExpression("40>>2"),"10");
        assertEquals(new String11().calculateExpression("40><2"),"Error");
        assertEquals(new String11().calculateExpression("40<>2"),"Error");
    }
}
