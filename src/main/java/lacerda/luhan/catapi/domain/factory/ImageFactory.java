package lacerda.luhan.catapi.domain.factory;

import lacerda.luhan.catapi.domain.dto.ImageDto;
import lacerda.luhan.catapi.entity.Image;
import org.springframework.stereotype.Component;

@Component
public class ImageFactory {

    public Image createImageEntity(Integer height, String url, Integer width) {
        return Image.builder().height(height).url(url).width(width).build();
    }

    public ImageDto createImageDto(Integer height, String url, Integer width) {
        return ImageDto.builder().height(height).url(url).width(width).build();
    }
}
