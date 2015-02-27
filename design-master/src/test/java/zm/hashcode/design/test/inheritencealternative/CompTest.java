package zm.hashcode.design.test.inheritencealternative;

import zm.hashcode.design.carinterface.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CompTest {

    private CarInterfaceImpl car;
    @Before
    public void setUp() throws Exception {
        car = new CarInterfaceImpl("Toyota");
    }

    @Test
    public void testEncaps() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}
