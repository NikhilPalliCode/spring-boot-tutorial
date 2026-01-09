package com.nutorials.spring_demo.service;

import com.nutorials.spring_demo.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(1,"Iphone",1000),
            new Product(2, "Samsung", 800)
    );
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
       return products.stream()
               .filter(product -> product.getProdId() == prodId)
               .findFirst()
               .orElseThrow(() -> new ResponseStatusException(
                       HttpStatus.NOT_FOUND,
                       "Product with ID " + prodId + " not found"
               ));
    }
}
