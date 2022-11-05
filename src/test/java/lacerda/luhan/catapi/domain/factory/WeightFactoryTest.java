package lacerda.luhan.catapi.domain.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.MockitoAnnotations.openMocks;

class WeightFactoryTest {

    @InjectMocks
    private WeightFactory weightFactory;

    @BeforeEach
    public void setup() {
        openMocks(this);
    }

    @Test
    void createWeightEntity_WithSuccess() {
        // arrange and act
        var response = this.weightFactory.createWeightEntity("1", "2");

        // assert
        assertNotNull(response);
    }

    @Test
    void createWeightDto_WithSuccess() {
        // arrange and act
        var response = this.weightFactory.createWeightDto("1", "2");

        // assert
        assertNotNull(response);
    }
}
