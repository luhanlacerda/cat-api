package lacerda.luhan.catapi.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@EntityListeners(ImageToPersistListener.class)
@NoArgsConstructor
public class Image implements Serializable {

    @Id
    private String id;
    private Integer height;
    private String url;
    private Integer width;

    @Builder
    public Image(String id, Integer height, String url, Integer width) {
        this.id = id;
        this.height = height;
        this.url = url;
        this.width = width;
    }

}
