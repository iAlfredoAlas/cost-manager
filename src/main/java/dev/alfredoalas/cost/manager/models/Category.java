package dev.alfredoalas.cost.manager.models;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_category")
    private int idCategory;

    @Basic(optional = false)
    @Column(name = "name_category")
    private String nameCategory;

    @JoinColumn(name = "id_category_icon", referencedColumnName = "id_category_icon", foreignKey = @ForeignKey(name = "FK_categories_category_icons"))
    @ManyToOne(optional = false, targetEntity = CategoryIcon.class)
    private CategoryIcon idCategoryIcon;

}
