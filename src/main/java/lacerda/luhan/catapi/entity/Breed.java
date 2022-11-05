package lacerda.luhan.catapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EntityListeners(BreedToPersistListener.class)
@NoArgsConstructor
public class Breed implements Serializable {

    @Id
    private String id;
    private Integer adaptability;
    private Integer affectionLevel;
    private String altNames;
    private String cfaUrl;
    private Integer childFriendly;
    private String countryCode;
    private String countryCodes;

    @Column(length = 2000)
    private String description;
    private Integer dogFriendly;
    private Integer energyLevel;
    private Integer experimental;
    private Integer grooming;
    private Integer hairless;
    private Integer healthIssues;
    private Integer hypoallergenic;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "breedId", referencedColumnName = "id")
    private Image image;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weightId", referencedColumnName = "id")
    private Weight weight;

}
