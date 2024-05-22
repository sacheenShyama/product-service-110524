package com.example.product_servie_110524.dtos;

import com.example.product_servie_110524.models.Category;
import com.example.product_servie_110524.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String image;
    private String category;

    public Product toProduct() {
        Product product = new Product();

        product.setId(id);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setImageUrl(image);
        Category categoryObj = new Category();
        categoryObj.setTitle(category);

        product.setCategory(categoryObj);

        return product;
    }


}
