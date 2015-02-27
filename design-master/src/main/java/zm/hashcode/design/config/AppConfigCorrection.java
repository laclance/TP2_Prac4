package zm.hashcode.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Bird;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Dove;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Duck;
import zm.hashcode.design.softwaredesignprinciples.lsk.correction.Ostrich;

/**
 * Created by hashcode on 2015/02/25.
 */
@Configuration
public class AppConfigCorrection {
    @Bean(name="dove")
    public Bird getDove(){
        return new Dove();
    }
    @Bean(name="duck")
    public Bird getDuck(){
        return new Duck();
    }
    @Bean(name="ostritch")
    public Bird getOstritch(){
        return new Ostrich();
    }

}
