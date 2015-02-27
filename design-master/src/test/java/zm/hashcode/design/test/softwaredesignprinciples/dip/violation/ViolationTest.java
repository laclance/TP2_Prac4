package zm.hashcode.design.test.softwaredesignprinciples.dip.violation;

import zm.hashcode.design.softwaredesignprinciples.dip.Violation.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ViolationTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("Toyota");
    }

    @Test
    public void testdip() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}
