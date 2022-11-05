package lacerda.luhan.catapi.client;

import lacerda.luhan.catapi.config.FeignConfig;
import lacerda.luhan.catapi.domain.response.BreedCatApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "theCatClient", url = "${the.cats.host.value}", configuration = FeignConfig.class)
public interface TheCatClient {

    @GetMapping(value = "/v1/breeds")
    List<BreedCatApiResponse> getBreeds(@RequestHeader("x-api-key") String apiKey);
}
