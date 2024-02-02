package dev.alfredoalas.cost.manager.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_transaction")
    private int idTransaction;

    @Basic(optional = false)
    @Column(name = "date_transaction")
    private LocalDate dateTransaction;

    @Basic(optional = false)
    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @JoinColumn(name = "id_category", referencedColumnName = "id_category", foreignKey = @ForeignKey(name = "FK_transactions_categories"))
    @ManyToOne(optional = false, targetEntity = Category.class)
    private Category idCategory;

    @JoinColumn(name = "id_account", referencedColumnName = "id_account", foreignKey = @ForeignKey(name = "FK_transactions_accounts"))
    @ManyToOne(optional = false, targetEntity = Account.class)
    private Account idAccount;

}
