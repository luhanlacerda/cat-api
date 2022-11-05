package lacerda.luhan.catapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("lacerda.luhan.catapi")
@EnableScheduling
@EnableAspectJAutoProxy
public class MainConfig {

}
