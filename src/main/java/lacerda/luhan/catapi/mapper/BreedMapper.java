package lacerda.luhan.catapi.mapper;

import lacerda.luhan.catapi.controller.model.BreedResponse;
import lacerda.luhan.catapi.domain.dto.BreedDto;
import lacerda.luhan.catapi.domain.response.BreedCatApiResponse;
import lacerda.luhan.catapi.entity.Breed;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BreedMapper {

    List<Breed> breedsCatApiResponseToBreeds(List<BreedCatApiResponse> breedCatApiResponses);

    List<BreedDto> breedEntityToDto(List<Breed> breeds);

    List<BreedResponse> breedsDtoToResponse(List<BreedDto> breedDtos);

    BreedResponse breedDtoToResponse(BreedDto breedto);

    Breed breedDtoToEntity(BreedDto breedDto);

    BreedDto breedEntityToDto(Breed breed);
}
