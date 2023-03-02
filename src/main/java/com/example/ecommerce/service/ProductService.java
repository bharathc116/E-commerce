package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    Product updateProduct(Integer id,Product product);
    Product getProductById(Integer id);
    List<Product> getAll();
    void deleteProduct(Integer id);
}
