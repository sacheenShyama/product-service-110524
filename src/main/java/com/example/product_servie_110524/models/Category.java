package com.example.product_servie_110524.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter


@Entity
public class Category extends BaseModel {
    private String title;
    @OneToMany(mappedBy = "category")
    List<Product> products;
}
