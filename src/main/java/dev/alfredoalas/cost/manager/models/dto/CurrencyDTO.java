package dev.alfredoalas.cost.manager.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CurrencyDTO {

    private int idCurrency;

    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚ ]{1,45}$", message = "The currency name must contain a maximum of 45 alphabetical characters.")
    private String nameCurrency;

    @Pattern(regexp = "^[A-Z]{3}$", message = "The ISO code must be composed of 3 alphabetic characters")
    private String isoCodeCurrency;

    private String symbolCurrency;

}
