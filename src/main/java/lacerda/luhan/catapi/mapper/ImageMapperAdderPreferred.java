package lacerda.luhan.catapi.mapper;

import lacerda.luhan.catapi.controller.model.ImageResponse;
import lacerda.luhan.catapi.domain.dto.ImageDto;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, uses = BreedMapper.class)
public interface ImageMapperAdderPreferred {

    ImageDto imageResponseToImageDto(ImageResponse imageResponse);

    ImageResponse imageDtoToImageResponse(ImageDto imageDto);
}
