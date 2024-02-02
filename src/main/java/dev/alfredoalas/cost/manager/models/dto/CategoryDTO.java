package dev.alfredoalas.cost.manager.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDTO {

    private int idCategory;

    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚ ]{1,40}$", message = "The category name must contain a maximum of 40 alphabetical characters.")
    private String nameCategory;

    @NotNull(message = "The category cannot be left without an icon.")
    private CategoryIconDTO idCategoryIcon;

}
