package lacerda.luhan.catapi.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Objects;
import java.util.UUID;

public class ImageToPersistListener {

    @PrePersist
    @PreUpdate
    public void methodExecuteBeforeSave(final Image reference) {
        if (Objects.isNull(reference.getId())) {
            reference.setId(UUID.randomUUID().toString());
        }
    }
}
