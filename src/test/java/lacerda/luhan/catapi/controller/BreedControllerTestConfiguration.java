package lacerda.luhan.catapi.controller;

import lacerda.luhan.catapi.domain.factory.BreedFactory;
import lacerda.luhan.catapi.mapper.BreedMapper;
import lacerda.luhan.catapi.service.BreedService;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class BreedControllerTestConfiguration {

    @MockBean
    BreedService breedService;

    @MockBean
    BreedFactory breedFactory;

    @Bean
    public BreedMapper breedMapper() {
        return Mappers.getMapper(BreedMapper.class);
    }

}
