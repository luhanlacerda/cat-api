package lacerda.luhan.catapi.service;

import lacerda.luhan.catapi.config.exception.NotFoundException;
import lacerda.luhan.catapi.domain.dto.BreedDto;
import lacerda.luhan.catapi.entity.Breed;
import lacerda.luhan.catapi.mapper.BreedMapper;
import lacerda.luhan.catapi.repository.BreedRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

class BreedServiceTest {

    @Mock
    private BreedRepository breedRepository;

    @Spy
    private BreedMapper breedMapper;

    @InjectMocks
    private BreedService breedService;

    @BeforeEach
    public void setup() {
        breedMapper = Mappers.getMapper(BreedMapper.class);
        openMocks(this);
    }

    @Test
    void findAllBreeds_WithSuccess() {
        // arrange
        when(breedRepository.findAll()).thenReturn(List.of(new Breed()));

        // act
        var response = this.breedService.findAllBreeds();

        // assert
        assertNotNull(response);
    }

    @Test
    void getBreedById_WithSuccess() {
        // arrange
        when(breedRepository.findById(any())).thenReturn(java.util.Optional.of(new Breed()));

        // act
        var response = this.breedService.findBreedById("1");

        // assert
        assertNotNull(response);
    }

    @Test
    void getBreedById_ThenThrowNotFoundException() {
        // arrange
        when(breedRepository.findById(any())).thenReturn(Optional.empty());

        // act and assert
        assertThrows(NotFoundException.class, () -> {
            this.breedService.findBreedById("2");
        });
    }

    @Test
    void saveBreed_WithSuccess() {
        // arrange
        when(breedRepository.save(any())).thenReturn(new Breed());

        // act
        var response = this.breedService.save(BreedDto.builder().build());

        // assert
        assertNotNull(response);
    }


    @Test
    void deleteBreedById_WithSuccess() {
        // arrange
        doNothing().when(breedRepository).deleteById(any());

        // act and assert
        assertThatCode(() -> this.breedService.deleteById("3"))
                .doesNotThrowAnyException();
    }

    @Test
    void deleteBreedById_ThenThrowNotFoundException() {
        // arrange
        doThrow(EmptyResultDataAccessException.class).when(breedRepository).deleteById(any());

        // act and assert
        assertThrows(NotFoundException.class, () -> {
            this.breedService.deleteById("4");
        });
    }
}
