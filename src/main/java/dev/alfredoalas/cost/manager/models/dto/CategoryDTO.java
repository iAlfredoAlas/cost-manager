package dev.alfredoalas.cost.manager.models.dto;

import dev.alfredoalas.cost.manager.models.CategoryIcon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDTO {

    private int idCategory;

    @NotBlank(message = "The category cannot be left empty.")
    private String nameCategory;

    @NotNull(message = "The category cannot be left without an icon.")
    private CategoryIcon idCategoryIcon;

}
