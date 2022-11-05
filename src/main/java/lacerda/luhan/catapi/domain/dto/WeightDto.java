package lacerda.luhan.catapi.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class WeightDto {

    private String id;
    private String imperial;
    private String metric;

    @Builder
    public WeightDto(String id, String imperial, String metric) {
        this.id = id;
        this.imperial = imperial;
        this.metric = metric;
    }
}
