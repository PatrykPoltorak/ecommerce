package com.example.ecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Product {
    @Id
    private long id;
    private String productName;
    private String description;
    private double price;
    @OneToMany(mappedBy = "product")
    private List<ProductCategory> productCategory;

}
