package lacerda.luhan.catapi.controller.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BreedRequest {

    private Integer adaptability;
    private Integer affectionLevel;
    private String altNames;
    private String cfaUrl;
    private Integer childFriendly;
    private String countryCode;
    private String countryCodes;
    private String description;
    private Integer dogFriendly;
    private Integer energyLevel;
    private Integer experimental;
    private Integer grooming;
    private Integer hairless;
    private Integer healthIssues;
    private Integer hypoallergenic;
    private String id;
    private Integer indoor;
    private Integer intelligence;
    private Integer lap;
    private String lifeSpan;
    private String name;
    private Integer natural;
    private String origin;
    private Integer rare;
    private String referenceImageId;
    private Integer rex;
    private Integer sheddingLevel;
    private Integer shortLegs;
    private Integer socialNeeds;
    private Integer strangerFriendly;
    private Integer suppressedTail;
    private String temperament;
    private String vcahospitalsUrl;
    private String vetstreetUrl;
    private Integer vocalisation;
    private String wikipediaUrl;
    private Integer imageHeight;
    private String imageUrl;
    private Integer imageWidth;
    private String weightImperial;
    private String weightMetric;

    @Builder
    public BreedRequest(Integer adaptability, Integer affectionLevel, String altNames, String cfaUrl, Integer childFriendly,
                        String countryCode, String countryCodes, String description, Integer dogFriendly, Integer energyLevel,
                        Integer experimental, Integer grooming, Integer hairless, Integer healthIssues, Integer hypoallergenic,
                        String id, Integer indoor, Integer intelligence, Integer lap, String lifeSpan, String name,
                        Integer natural, String origin, Integer rare, String referenceImageId, Integer rex,
                        Integer sheddingLevel, Integer shortLegs, Integer socialNeeds, Integer strangerFriendly,
                        Integer suppressedTail, String temperament, String vcahospitalsUrl, String vetstreetUrl,
                        Integer vocalisation, String wikipediaUrl, Integer imageHeight, String imageUrl, Integer imageWidth,
                        String weightImperial, String weightMetric) {
        this.adaptability = adaptability;
        this.affectionLevel = affectionLevel;
        this.altNames = altNames;
        this.cfaUrl = cfaUrl;
        this.childFriendly = childFriendly;
        this.countryCode = countryCode;
        this.countryCodes = countryCodes;
        this.description = description;
        this.dogFriendly = dogFriendly;
        this.energyLevel = energyLevel;
        this.experimental = experimental;
        this.grooming = grooming;
        this.hairless = hairless;
        this.healthIssues = healthIssues;
        this.hypoallergenic = hypoallergenic;
        this.id = id;
        this.indoor = indoor;
        this.intelligence = intelligence;
        this.lap = lap;
        this.lifeSpan = lifeSpan;
        this.name = name;
        this.natural = natural;
        this.origin = origin;
        this.rare = rare;
        this.referenceImageId = referenceImageId;
        this.rex = rex;
        this.sheddingLevel = sheddingLevel;
        this.shortLegs = shortLegs;
        this.socialNeeds = socialNeeds;
        this.strangerFriendly = strangerFriendly;
        this.suppressedTail = suppressedTail;
        this.temperament = temperament;
        this.vcahospitalsUrl = vcahospitalsUrl;
        this.vetstreetUrl = vetstreetUrl;
        this.vocalisation = vocalisation;
        this.wikipediaUrl = wikipediaUrl;
        this.imageHeight = imageHeight;
        this.imageUrl = imageUrl;
        this.imageWidth = imageWidth;
        this.weightImperial = weightImperial;
        this.weightMetric = weightMetric;
    }
}
