package zm.hashcode.design.test.objectorientatedprinciples;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.design.carinterface.*;

public class InheritTest {
    private CarInterface car;

    @Before
    public void setUp() throws Exception {
        car = new CarInterfaceBakkieImpl("Toyota", 1000);
    }

    @Test
    public void testEncaps() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}
