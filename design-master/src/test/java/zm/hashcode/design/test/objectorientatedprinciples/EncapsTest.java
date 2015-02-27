package zm.hashcode.design.test.objectorientatedprinciples;

import zm.hashcode.design.objectorientedprinciples.encapsulation.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EncapsTest {

    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car("Toyota");
    }

    @Test
    public void testEncaps() throws Exception {
        Assert.assertEquals("Toyota", car.getMake());
    }
}
