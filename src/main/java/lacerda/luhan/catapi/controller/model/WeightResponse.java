package lacerda.luhan.catapi.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
public class WeightResponse {

    private String id;
    private String imperial;
    private String metric;

    @Builder
    public WeightResponse(String id, String imperial, String metric) {
        this.id = id;
        this.imperial = imperial;
        this.metric = metric;
    }
}
