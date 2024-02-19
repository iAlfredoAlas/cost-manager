package dev.alfredoalas.cost.manager.models;
/*
 * Represents a financial account used for tracking income and expenses.
 * @autor Alfredo Alas
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "accounts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account implements Serializable {

    /**
     * The unique identifier of the account.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_account")
    private int idAccount;

    /**
     * The descriptive name of the account.
     */
    @Basic(optional = false)
    @Column(name = "name_account")
    private String nameAccount;

    /**
     * The initial balance of the account.
     */
    @Basic(optional = false)
    @Column(name = "initial_account_balance")
    private BigDecimal initialAccountBalance;

    /**
     * The date the initial balance was established.
     */
    @Basic(optional = false)
    @Column(name = "initial_balance_date")
    private LocalDate intialAccountDate;

    /**
     *Indicates whether the account should be included in the balance sheet (true) or
     * excluded from the balance sheet (false).
     */
    @Basic(optional = false)
    @Column(name = "balance")
    private Boolean isBalance;

    /**
     * The currency associated with the account.
     */
    @JoinColumn(name = "id_currency", referencedColumnName = "id_currency", foreignKey = @ForeignKey(name = "FK_accounts_currencies"))
    @ManyToOne(optional = false, targetEntity = Currency.class)
    private Currency idCurrency;

}
