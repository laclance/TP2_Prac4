package zm.hashcode.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Bird;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Dove;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Duck;
import zm.hashcode.design.softwaredesignprinciples.lsk.violation.Ostrich;

/**
 * Created by hashcode on 2015/02/25.
 */
@Configuration
public class AppConfigViolation {
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
