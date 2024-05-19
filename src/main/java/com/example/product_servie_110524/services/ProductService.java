package com.example.product_servie_110524.services;

import com.example.product_servie_110524.dtos.FakeStoreDto;
import com.example.product_servie_110524.dtos.ProductResponseDto;
import com.example.product_servie_110524.models.Product;

public interface ProductService {
    public ProductResponseDto getSingleProduct(int productId);
    public ProductResponseDto addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price);

}
