package zm.hashcode.design.test.softwaredesignprinciples.lsk.correction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zm.hashcode.design.config.AppConfigCorrection;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Bird;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Dove;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Duck;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Ostrich;

import java.util.ArrayList;
import java.util.List;

public class CorrectionTest {
    private Dove dove;
    private Duck duck;
    private Ostrich ostrich;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfigCorrection.class);
        duck = (Duck) ctx.getBean("duck");
        dove = (Dove) ctx.getBean("dove");
        ostrich = (Ostrich) ctx.getBean("ostritch");
    }

    @Test
    public void testCorrection() throws Exception {
        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(duck);
        birdList.add(dove);
        birdList.add(ostrich);
        for (Bird bird : birdList) {
            bird.eat();
            Assert.assertNotNull(bird);
        }
    }
}
