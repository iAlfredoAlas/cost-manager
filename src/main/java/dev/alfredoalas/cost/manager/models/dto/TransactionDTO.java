package dev.alfredoalas.cost.manager.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class TransactionDTO {

    private int idTransaction;

    @Pattern(regexp = "^(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-\\d{4}$", message = "The date must be in DD-MM-YYYYY format.")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateTransaction;

    @NotNull(message = "You must add an initial value to the account.")
    @Digits(fraction = 2, integer = 5, message = "May not exceed 5 integers and 2 decimal places.")
    private BigDecimal transactionAmount;

    @NotNull(message = "Must add a category type.")
    private CategoryDTO idCategory;

    @NotNull(message = "Must add a account.")
    private AccountDTO idAccount;

}
