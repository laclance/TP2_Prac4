package zm.hashcode.design.test.softwaredesignprinciples.lsk.violation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zm.hashcode.design.config.AppConfigViolation;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Bird;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Dove;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Duck;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Ostrich;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hashcode on 2015/02/25.
 */
public class ViolationTest {
    private Dove dove;
    private Duck duck;
    private Ostrich ostrich;
    private ApplicationContext ctx;



    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigViolation.class);
        duck = (Duck)ctx.getBean("duck");
        dove = (Dove)ctx.getBean("dove");
        ostrich = (Ostrich)ctx.getBean("ostritch");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testViolation() throws Exception {
        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(duck);
        birdList.add(dove);
        birdList.add(ostrich);
        for (Bird bird : birdList) {
            bird.fly();
            bird.eat();
        }
    }
}
