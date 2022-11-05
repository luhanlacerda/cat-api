package lacerda.luhan.catapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.List;

@Configuration
public class SwaggerConfiguration {

    private static final String DESCRIPTION_API = "The Cats API";

    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
            "cat-api API",
            DESCRIPTION_API,
            "1.0",
            "Terms of Service",
            new Contact("Luhan Lacerda", "https://www.linkedin.com/in/luhanlacerda/",
                    "luhanlacerda@gmail.com.com"),
            "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0",
            List.of());

    public static final String BREED_TAG = "breed-controller";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .tags(
                        new Tag(BREED_TAG, "Breed Actions", 0)
                );
    }

}
