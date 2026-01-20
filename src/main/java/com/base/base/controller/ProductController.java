package com.base.base.controller;

import com.base.base.model.Product;
import com.base.base.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productRepository.getProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productRepository.addProduct(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(
            @PathVariable int id,
            @RequestBody Product product){
        productRepository.updateProduct(id, product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(
            @PathVariable int id){
        productRepository.deleteProduct(id);
    }
}
