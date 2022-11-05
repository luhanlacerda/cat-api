package lacerda.luhan.catapi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class TemplateClientConfiguration {

    @Value("${the.cats.host.value}")
    private String urlTemplate;

}
