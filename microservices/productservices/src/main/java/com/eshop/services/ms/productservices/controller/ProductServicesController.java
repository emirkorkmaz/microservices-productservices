package com.eshop.services.ms.productservices.controller;

import com.eshop.services.ms.productservices.entity.Product;
import com.eshop.services.ms.productservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductServicesController {

    @Autowired
    Environment environment;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products/get_all")
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        products.forEach(product -> product.setPort(environment.getProperty("server.port")));

        return productRepository.findAll();
    }

    @GetMapping("/products/get_by_id/{ID}")
    public Product getProductById(@PathVariable Long ID) {
        Product product = productRepository.findByProductId(ID);

        if(null != product)
            product.setPort(environment.getProperty("server.port"));

        return productRepository.findByProductId(ID);
    }
}
