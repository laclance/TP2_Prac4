package zm.hashcode.design.test.softwaredesignprinciples.plk.correction;

import zm.hashcode.design.softwaredesignprinciples.plk.Correction.Car;
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
    public void testplk() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}