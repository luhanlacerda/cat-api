package lacerda.luhan.catapi.service;

import lacerda.luhan.catapi.client.TheCatClient;
import lacerda.luhan.catapi.domain.response.BreedCatApiResponse;
import lacerda.luhan.catapi.entity.Breed;
import lacerda.luhan.catapi.mapper.BreedMapper;
import lacerda.luhan.catapi.repository.BreedRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class PopulateDbServiceTest {

    @Mock
    private BreedRepository breedRepository;

    @Spy
    private BreedMapper breedMapper;

    @Mock
    private TheCatClient theCatClient;

    @InjectMocks
    private PopulateDbService populateDbService;

    @BeforeEach
    public void setup() {
        breedMapper = Mappers.getMapper(BreedMapper.class);
        openMocks(this);
    }

    @Test
    void updateDatabaseFromCatsApi_WithSuccess() {
        // arrange
        when(breedRepository.saveAll(any())).thenReturn(List.of(new Breed()));
        when(theCatClient.getBreeds(any())).thenReturn(List.of(BreedCatApiResponse.builder().build()));

        // act
        var response = this.populateDbService.updateDatabaseFromCatsApi();

        // assert
        assertNotNull(response);
    }

}
