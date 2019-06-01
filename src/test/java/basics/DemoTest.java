package basics;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

    @Test
    public void test_sum(){
        Assert.assertEquals(new Demo().sum(2, 8), 10);
    }

    @Test
    public void test_sub(){
        Assert.assertEquals(new Demo().sub(8, 3), 5);
    }

    @Test
    public void test_multiple(){
        Assert.assertEquals(new Demo().multiple(8, 3), 24);
    }
}