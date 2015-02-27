package zm.hashcode.design.test.softwaredesignprinciples.ocp.violation;

import zm.hashcode.design.softwaredesignprinciples.ocp.Violation.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ViolationTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car("Toyota");
    }

    @Test
    public void testocp() throws Exception {
        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(car);
        for (Car car : carList) {
            car.print();
            Assert.assertNotNull(car);
        }
    }
}
