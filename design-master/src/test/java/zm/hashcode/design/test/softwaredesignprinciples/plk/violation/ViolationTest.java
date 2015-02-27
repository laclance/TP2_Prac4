package zm.hashcode.design.test.softwaredesignprinciples.plk.violation;

import zm.hashcode.design.softwaredesignprinciples.plk.Violation.Car;
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
    public void testplk() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}
