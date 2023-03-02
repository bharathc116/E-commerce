package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;
    @Override
    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Integer id, Product product) {
        Product product1=productRepo.findById(id).orElseThrow(
                ()->new RuntimeException()
        );
product1.setName(Objects.isNull(product.getName())?product1.getName(): product.getName() );
product1.setDescription(Objects.isNull(product.getDescription())? product1.getDescription():product.getDescription() );
        return productRepo.save(product1);
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).orElseThrow(
                ()->new RuntimeException()
        );
    }

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public void deleteProduct(Integer id) {
    Product it=productRepo.findById(id).orElseThrow(
            ()->new RuntimeException()
    );
productRepo.delete(it);

    }
}
