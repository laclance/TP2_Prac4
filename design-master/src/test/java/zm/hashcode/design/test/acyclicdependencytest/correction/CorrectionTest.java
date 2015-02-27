package zm.hashcode.design.test.acyclicdependencytest.correction;

import zm.hashcode.design.carinterface.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CorrectionTest {
    private CarInterface car;

    @Before
    public void setUp() throws Exception {
        car = new CarInterfaceTruckImpl("Toyota");
    }

    @Test
    public void testEncaps() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}
