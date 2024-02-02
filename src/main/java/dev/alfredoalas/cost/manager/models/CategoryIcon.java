package dev.alfredoalas.cost.manager.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "category_icons")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryIcon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_category_icon")
    private int idCategoryIcon;

    @Basic(optional = false)
    @Column(name = "category_icon")
    private String categoryIcon;

}
