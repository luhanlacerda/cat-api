package lacerda.luhan.catapi.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
public class ImageResponse {

    private String id;
    private Integer height;
    private String url;
    private Integer width;

    @Builder
    public ImageResponse(String id, Integer height, String url, Integer width) {
        this.id = id;
        this.height = height;
        this.url = url;
        this.width = width;
    }
}
