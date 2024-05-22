package com.example.product_servie_110524.repositories;

import com.example.product_servie_110524.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category save(Category category);
    Category findByTitle(String name);
}
