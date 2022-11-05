package lacerda.luhan.catapi.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class ImageDto {

    private String id;
    private Integer height;
    private String url;
    private Integer width;

    @Builder
    public ImageDto(String id, Integer height, String url, Integer width) {
        this.id = id;
        this.height = height;
        this.url = url;
        this.width = width;
    }
}
