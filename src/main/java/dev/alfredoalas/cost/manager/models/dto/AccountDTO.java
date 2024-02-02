package dev.alfredoalas.cost.manager.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.alfredoalas.cost.manager.models.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountDTO {

    private int idAccount;

    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚ ]{1,40}$", message = "The account name must contain a maximum of 40 alphabetical characters.")
    private String nameAccount;

    @NotNull(message = "You must add an initial value to the account.")
    @Digits(fraction = 2, integer = 5, message = "May not exceed 5 integers and 2 decimal places.")
    private BigDecimal initialAccountBalance;

    @Pattern(regexp = "^(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-\\d{4}$", message = "The date must be in DD-MM-YYYYY format.")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate intialAccountDate;

    @NotNull(message = "You must choose whether you want it to appear in the balance sheet or not.")
    private Boolean isBalance;

    @NotNull(message = "Must add a currency type.")
    private Currency idCurrency;

}
