package com.eshop.services.ms.productservices.repository;

import com.eshop.services.ms.productservices.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    List<Product> findAll();

    Product findByProductId(Long productId);
}
