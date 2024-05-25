package com.example.product_servie_110524.projections;

import com.example.product_servie_110524.models.Category;

import java.math.BigDecimal;

public interface ProductProjection {
    Long getId();
    String getTitle();
    String getDescription();
    BigDecimal getPrice();
    Category getCategory();
    String getImageUrl();
}