package lacerda.luhan.catapi.service;

import lacerda.luhan.catapi.client.TheCatClient;
import lacerda.luhan.catapi.domain.dto.BreedDto;
import lacerda.luhan.catapi.mapper.BreedMapper;
import lacerda.luhan.catapi.repository.BreedRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableAsync
public class PopulateDbService {

    private final String apiKey;
    private final BreedRepository breedRepository;
    private final BreedMapper breedMapper;
    private final TheCatClient theCatClient;

    public PopulateDbService(@Value("${the.cats.api.key.value}") String apiKey, BreedRepository breedRepository,
                             BreedMapper breedMapper, TheCatClient theCatClient) {
        this.apiKey = apiKey;
        this.breedRepository = breedRepository;
        this.breedMapper = breedMapper;
        this.theCatClient = theCatClient;
    }

    @Async
    @Scheduled(cron = "${cron.expression}")
    public List<BreedDto> updateDatabaseFromCatsApi() {
        var breedResponses = theCatClient.getBreeds(apiKey);

        return breedMapper.breedEntityToDto(breedRepository.saveAll(breedMapper.breedsCatApiResponseToBreeds(breedResponses)));
    }


}
