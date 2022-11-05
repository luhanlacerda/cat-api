package lacerda.luhan.catapi.domain.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.MockitoAnnotations.openMocks;

class ImageFactoryTest {

    @InjectMocks
    private ImageFactory imageFactory;

    @BeforeEach
    public void setup() {
        openMocks(this);
    }

    @Test
    void createImageEntity_WithSuccess() {
        // arrange and act
        var response = this.imageFactory.createImageEntity(1, "1", 2);

        // assert
        assertNotNull(response);
    }

    @Test
    void createImageDto_WithSuccess() {
        // arrange and act
        var response = this.imageFactory.createImageDto(3, "4", 5);

        // assert
        assertNotNull(response);
    }
}
