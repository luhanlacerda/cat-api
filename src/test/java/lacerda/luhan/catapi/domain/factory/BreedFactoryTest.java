package lacerda.luhan.catapi.domain.factory;

import lacerda.luhan.catapi.controller.model.BreedRequest;
import lacerda.luhan.catapi.domain.dto.ImageDto;
import lacerda.luhan.catapi.domain.dto.WeightDto;
import lacerda.luhan.catapi.mapper.BreedMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class BreedFactoryTest {

    @Mock
    private ImageFactory imageFactory;

    @Spy
    private BreedMapper breedMapper;

    @Mock
    private WeightFactory weightFactory;

    @InjectMocks
    private BreedFactory breedFactory;

    @BeforeEach
    public void setup() {
        breedMapper = Mappers.getMapper(BreedMapper.class);
        openMocks(this);
    }

    @Test
    void createBreedDtoFromRequest_WithSuccess() {
        // arrange
        when(imageFactory.createImageDto(any(), any(), any())).thenReturn(ImageDto.builder().build());
        when(weightFactory.createWeightDto(any(), any())).thenReturn(WeightDto.builder().build());

        // act
        var response = this.breedFactory.createBreedDtoFromRequest(BreedRequest.builder().build());

        // assert
        assertNotNull(response);
    }
}
