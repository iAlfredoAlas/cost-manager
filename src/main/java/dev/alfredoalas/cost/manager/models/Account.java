package dev.alfredoalas.cost.manager.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "accounts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_account")
    private int idAccount;

    @Basic(optional = false)
    @Column(name = "name_account")
    private String nameAccount;

    @Basic(optional = false)
    @Column(name = "initial_account_balance")
    private Double initialAccountBalance;

    @Basic(optional = false)
    @Column(name = "initial_account_date")
    private LocalDate intialAccountDate;

    @Basic(optional = false)
    @Column(name = "balance")
    private Boolean isBalance;

    @JoinColumn(name = "idCurrency", referencedColumnName = "id_currency", foreignKey = @ForeignKey(name = "FK_accounts_currencies"))
    @ManyToOne(optional = false, targetEntity = Currency.class)
    private Currency idCurrency;

}
