package dev.alfredoalas.cost.manager.models;
/**
 * Represents a category for classifying financial transactions.
 * @author Alfredo Alas
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category implements Serializable {

    /**
     * The unique identifier of the category.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_category")
    private int idCategory;

    /**
     * The descriptive name of the category (e.g., "Utilities", "Groceries").
     */
    @Basic(optional = false)
    @Column(name = "name_category")
    private String nameCategory;

    /**
     * The icon associated with the category.
     */
    @JoinColumn(name = "id_category_icon", referencedColumnName = "id_category_icon", foreignKey = @ForeignKey(name = "FK_categories_category_icons"))
    @ManyToOne(optional = false, targetEntity = CategoryIcon.class)
    private CategoryIcon idCategoryIcon;

}
