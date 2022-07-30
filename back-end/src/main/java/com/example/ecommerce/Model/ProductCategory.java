package com.example.ecommerce.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class ProductCategory {
    @Id
    private long id;
    private String categoryName;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
}
