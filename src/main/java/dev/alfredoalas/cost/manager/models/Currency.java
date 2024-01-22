package dev.alfredoalas.cost.manager.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "currencies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Currency implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_currency")
    private int idCurrency;

    @Basic(optional = false)
    @Column(name = "name_currency")
    private String nameCurrency;

    @Basic(optional = false)
    @Column(name = "iso_code_currency")
    private String isoCodeCurrency;

    @Basic(optional = false)
    @Column(name = "symbol_currency")
    private String symbolCurrency;

}
