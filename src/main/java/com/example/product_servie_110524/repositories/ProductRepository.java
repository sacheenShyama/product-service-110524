package com.example.product_servie_110524.repositories;


import com.example.product_servie_110524.models.Product;
import com.example.product_servie_110524.projections.ProductProjection;
import com.example.product_servie_110524.projections.ProductWithIdAndTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);
    List<Product> findAll();
    Product findByIdIs(Long id);

    List<Product> findAllByCategory_Title(String title);
    List<Product> findByCategory_TitleContaining(String title);

    @Query("select p from Product p where p.category.title = :categoryName")
    List<Product> getProductWithCategoryName(String categoryName);

    @Query("select p.title as title from Product p where p.category.title = :categoryName")
    List<String> someTitleMethod(String categoryName);


    @Query("select p.id as id, p.title as title from Product p where p.category.title = :categoryName")
    List<ProductWithIdAndTitle> someMethod1(String categoryName);


    @Query("select p.id as id, p.title as title from Product p where p.category.title = :categoryName")
    List<ProductProjection> someMethod2(String categoryName);

    // Native SQL query

    @Query(value = "select * from product p where p.id = :id", nativeQuery = true)
    ProductProjection someNativeSql(Long id);

    @Query(value = "select id, title from product where id = :id", nativeQuery = true)
    ProductProjection someNativeSql2(Long id);

}
