package lacerda.luhan.catapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lacerda.luhan.catapi.controller.model.BreedRequest;
import lacerda.luhan.catapi.domain.constant.EndpointNames;
import lacerda.luhan.catapi.domain.dto.BreedDto;
import lacerda.luhan.catapi.domain.factory.BreedFactory;
import lacerda.luhan.catapi.mapper.BreedMapper;
import lacerda.luhan.catapi.service.BreedService;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.support.GenericWebApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(classes = {
        BreedController.class,
        BreedService.class,
        BreedFactory.class,
        BreedControllerTestConfiguration.class
})
@EnableSpringDataWebSupport
@WebMvcTest(controllers = BreedController.class)
class BreedControllerComponentTest {
    private static final String ENDPOINT = "/v1/" + EndpointNames.BREED;

    @Autowired
    private BreedController controller;

    @Autowired
    private MockServletContext servletContext;

    @Autowired
    private BreedService breedService;

    @Autowired
    private BreedFactory breedFactory;

    @Autowired
    private BreedMapper breedMapper;

    protected MockMvc mvc;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        final GenericWebApplicationContext context = new GenericWebApplicationContext(servletContext);
        context.refresh();
        mvc = MockMvcBuilders.standaloneSetup(controller).build();

        when(breedService.findAllBreeds()).thenReturn(List.of(BreedDto.builder().build()));
        when(breedService.save(any())).thenReturn(BreedDto.builder().build());
        when(breedService.findBreedById(any())).thenReturn(BreedDto.builder().build());
        doNothing().when(breedService).deleteById(any());
        when(breedFactory.createBreedDtoFromRequest(any())).thenReturn(BreedDto.builder().build());
    }

    @Test
    void saveBreed_WithSuccess() throws Exception {
        // arrange
        var breedRequest = BreedRequest.builder().build();

        var mapper = new ObjectMapper();
        var json = new JSONObject(mapper.writeValueAsString(breedRequest));

        // act
        var perform = mvc.perform(
                MockMvcRequestBuilders.post(ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(json.toString()));

        var breedResponse = controller.saveBreed(breedRequest);

        // assert
        perform.andExpect(status().isOk());
        assertNotNull(breedResponse);
    }

    @Test
    void saveBreed_WithBadRequestError() throws Exception {
        // arrange
        var breedRequest = BreedRequest.builder().build();

        var mapper = new ObjectMapper();
        var json = new JSONObject(mapper.writeValueAsString(breedRequest));

        // act
        var perform = mvc.perform(
                MockMvcRequestBuilders.post(ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(""));

        var breedResponse = controller.saveBreed(breedRequest);

        // assert
        perform.andExpect(status().isBadRequest());
        assertNotNull(breedResponse);
    }
}
