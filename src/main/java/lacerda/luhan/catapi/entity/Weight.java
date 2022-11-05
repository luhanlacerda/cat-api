package lacerda.luhan.catapi.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class Weight implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Setter(AccessLevel.NONE)
    private String id;

    private String imperial;
    private String metric;

    @Builder
    public Weight(String id, String imperial, String metric) {
        this.id = id;
        this.imperial = imperial;
        this.metric = metric;
    }
}
