package lacerda.luhan.catapi.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lacerda.luhan.catapi.controller.model.ImageResponse;
import lacerda.luhan.catapi.controller.model.WeightResponse;
import lombok.Builder;
import lombok.Data;

@Data
public class BreedCatApiResponse {

    private Integer adaptability;

    @JsonProperty("affection_level")
    private Integer affectionLevel;

    @JsonProperty("alt_names")
    private String altNames;

    @JsonProperty("cfa_url")
    private String cfaUrl;

    @JsonProperty("child_friendly")
    private Integer childFriendly;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("country_codes")
    private String countryCodes;

    private String description;

    @JsonProperty("dog_friendly")
    private Integer dogFriendly;

    @JsonProperty("energy_level")
    private Integer energyLevel;

    private Integer experimental;

    private Integer grooming;

    private Integer hairless;

    @JsonProperty("health_issues")
    private Integer healthIssues;

    private Integer hypoallergenic;

    private String id;

    private Integer indoor;

    private Integer intelligence;

    private Integer lap;

    @JsonProperty("life_span")
    private String lifeSpan;

    private String name;

    private Integer natural;

    private String origin;

    private Integer rare;

    @JsonProperty("reference_image_id")
    private String referenceImageId;

    private Integer rex;

    @JsonProperty("shedding_level")
    private Integer sheddingLevel;

    @JsonProperty("short_legs")
    private Integer shortLegs;

    @JsonProperty("social_needs")
    private Integer socialNeeds;

    @JsonProperty("stranger_friendly")
    private Integer strangerFriendly;

    @JsonProperty("suppressed_tail")
    private Integer suppressedTail;

    private String temperament;

    @JsonProperty("vcahospitals_url")
    private String vcahospitalsUrl;

    @JsonProperty("vetstreet_url")
    private String vetstreetUrl;

    private Integer vocalisation;

    @JsonProperty("wikipedia_url")
    private String wikipediaUrl;

    private ImageResponse image;

    private WeightResponse weight;

    @Builder
    public BreedCatApiResponse(Integer adaptability, Integer affectionLevel, String altNames, String cfaUrl,
                               Integer childFriendly, String countryCode, String countryCodes, String description,
                               Integer dogFriendly, Integer energyLevel, Integer experimental, Integer grooming,
                               Integer hairless, Integer healthIssues, Integer hypoallergenic, String id, Integer indoor,
                               Integer intelligence, Integer lap, String lifeSpan, String name, Integer natural,
                               String origin, Integer rare, String referenceImageId, Integer rex, Integer sheddingLevel,
                               Integer shortLegs, Integer socialNeeds, Integer strangerFriendly, Integer suppressedTail,
                               String temperament, String vcahospitalsUrl, String vetstreetUrl, Integer vocalisation,
                               String wikipediaUrl, ImageResponse image, WeightResponse weight) {
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
        this.image = image;
        this.weight = weight;
    }
}
