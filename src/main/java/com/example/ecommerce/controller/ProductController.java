package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class ProductController {
    @Autowired
    ProductService productService;
@PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }
    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct( @PathVariable("id") Integer id,@RequestBody Product product){
     return ResponseEntity.ok(productService.updateProduct(id, product));
    }
    @GetMapping("/product")
    public List<Product> getALL(){
    return productService.getAll();
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Integer id){
     return ResponseEntity.ok().body(productService.getProductById(id));
    }
    @DeleteMapping("/product/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable Integer id){
    productService.deleteProduct(id);
    return new ResponseEntity<>("",HttpStatus.NO_CONTENT);
    }
}
