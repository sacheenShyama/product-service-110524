package com.example.product_servie_110524.services;

import com.example.product_servie_110524.dtos.FakeStoreDto;
import com.example.product_servie_110524.dtos.ProductResponseDto;
import com.example.product_servie_110524.exceptions.ProductNotFoundException;
import com.example.product_servie_110524.models.Product;

import java.util.List;

public interface ProductService {
    public Product getSingleProduct(int productId) throws ProductNotFoundException;
    public List<Product> getAllProducts();
    public Product addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price);

}
