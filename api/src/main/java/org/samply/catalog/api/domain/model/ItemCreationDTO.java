package org.samply.catalog.api.domain.model;

import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import lombok.Value;

@Value
@Schema(title = "Item")
public class ItemCreationDTO {

    @NotBlank
    @Schema(required = true)
    private final String title;

    @NotBlank
    @Schema(required = true)
    private final String description;

    @NotNull
    @PositiveOrZero
    @Schema(required = true)
    private final BigDecimal price;

    @NotNull
    private final Category category;

}
