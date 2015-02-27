package zm.hashcode.design.test.softwaredesignprinciples.isp.correction;

import zm.hashcode.design.softwaredesignprinciples.isp.Correction.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CorrectionTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("Toyota");
    }

    @Test
    public void testisp() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}
