package lacerda.luhan.catapi.domain.factory;

import lacerda.luhan.catapi.controller.model.BreedRequest;
import lacerda.luhan.catapi.domain.dto.BreedDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BreedFactory {

    private ImageFactory imageFactory;
    private WeightFactory weightFactory;

    public BreedDto createBreedDtoFromRequest(BreedRequest breedRequest) {
        return BreedDto.builder()
                .id(breedRequest.getId())
                .adaptability(breedRequest.getAdaptability())
                .affectionLevel(breedRequest.getAffectionLevel())
                .altNames(breedRequest.getAltNames())
                .cfaUrl(breedRequest.getCfaUrl())
                .childFriendly(breedRequest.getChildFriendly())
                .countryCode(breedRequest.getCountryCode())
                .countryCodes(breedRequest.getCountryCodes())
                .description(breedRequest.getDescription())
                .dogFriendly(breedRequest.getDogFriendly())
                .energyLevel(breedRequest.getEnergyLevel())
                .experimental(breedRequest.getExperimental())
                .grooming(breedRequest.getGrooming())
                .hairless(breedRequest.getHairless())
                .healthIssues(breedRequest.getHealthIssues())
                .hypoallergenic(breedRequest.getHypoallergenic())
                .indoor(breedRequest.getIndoor())
                .intelligence(breedRequest.getIntelligence())
                .lap(breedRequest.getLap())
                .lifeSpan(breedRequest.getLifeSpan())
                .name(breedRequest.getName())
                .natural(breedRequest.getNatural())
                .origin(breedRequest.getOrigin())
                .rare(breedRequest.getRare())
                .referenceImageId(breedRequest.getReferenceImageId())
                .rex(breedRequest.getRex())
                .sheddingLevel(breedRequest.getSheddingLevel())
                .shortLegs(breedRequest.getShortLegs())
                .socialNeeds(breedRequest.getSocialNeeds())
                .strangerFriendly(breedRequest.getStrangerFriendly())
                .suppressedTail(breedRequest.getSuppressedTail())
                .temperament(breedRequest.getTemperament())
                .vcahospitalsUrl(breedRequest.getVcahospitalsUrl())
                .wikipediaUrl(breedRequest.getWikipediaUrl())
                .image(imageFactory.createImageDto(breedRequest.getImageHeight(), breedRequest.getImageUrl(), breedRequest.getImageWidth()))
                .weight(weightFactory.createWeightDto(breedRequest.getWeightImperial(), breedRequest.getWeightMetric()))
                .build();
    }
}
