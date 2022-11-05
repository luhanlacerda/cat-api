package lacerda.luhan.catapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lacerda.luhan.catapi.config.SwaggerConfiguration;
import lacerda.luhan.catapi.config.aspect.LoggerAspectExecution;
import lacerda.luhan.catapi.controller.model.BreedRequest;
import lacerda.luhan.catapi.controller.model.BreedResponse;
import lacerda.luhan.catapi.domain.constant.EndpointNames;
import lacerda.luhan.catapi.domain.factory.BreedFactory;
import lacerda.luhan.catapi.mapper.BreedMapper;
import lacerda.luhan.catapi.service.BreedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Validated
@RestController
@RequestMapping("/v1/" + EndpointNames.BREED)
@Api(value = EndpointNames.BREED, produces = MediaType.APPLICATION_JSON_VALUE, tags = {SwaggerConfiguration.BREED_TAG})
public class BreedController {

    @Autowired
    private BreedService breedService;

    @Autowired
    private BreedMapper breedMapper;

    @Autowired
    private BreedFactory breedFactory;

    @ApiOperation(value = "Getting all breeds")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @LoggerAspectExecution
    public List<BreedResponse> getBreeds() {
        return breedMapper.breedsDtoToResponse(breedService.findAllBreeds());
    }

    @ApiOperation(value = "Getting breed by id")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @LoggerAspectExecution
    public BreedResponse findBreedById(@PathVariable String id) {
        return breedMapper.breedDtoToResponse(breedService.findBreedById(id));
    }

    @ApiOperation(value = "Save a breed")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @LoggerAspectExecution
    public BreedResponse saveBreed(@RequestBody @Valid BreedRequest request) {
        return breedMapper.breedDtoToResponse(breedService.save(breedFactory.createBreedDtoFromRequest(request)));
    }

    @ApiOperation(value = "Delete breed by id")
    @DeleteMapping(value = "/{id}")
    @LoggerAspectExecution
    void deleteBreed(@PathVariable String id) {
        breedService.deleteById(id);
    }

}
