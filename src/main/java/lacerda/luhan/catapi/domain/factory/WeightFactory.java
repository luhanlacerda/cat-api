package lacerda.luhan.catapi.domain.factory;

import lacerda.luhan.catapi.domain.dto.WeightDto;
import lacerda.luhan.catapi.entity.Weight;
import org.springframework.stereotype.Component;

@Component
public class WeightFactory {

    public Weight createWeightEntity(String imperial, String metric) {
        return Weight.builder().imperial(imperial).metric(metric).build();
    }

    public WeightDto createWeightDto(String imperial, String metric) {
        return WeightDto.builder().imperial(imperial).metric(metric).build();
    }
}
