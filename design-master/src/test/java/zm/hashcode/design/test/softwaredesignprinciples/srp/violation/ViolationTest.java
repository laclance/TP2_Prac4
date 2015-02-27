package zm.hashcode.design.test.softwaredesignprinciples.srp.violation;

import zm.hashcode.design.softwaredesignprinciples.srp.Violation.Car;
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
    public void testsrp() throws Exception {
        Assert.assertEquals("0734792681", car.getPhone());
    }
}
