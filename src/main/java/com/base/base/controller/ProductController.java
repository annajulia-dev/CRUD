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
        return productRepository.findAll();
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productRepository.save(product);
    }

    @PutMapping()
    public void updateProduct(
            @RequestBody Product product){
        productRepository.save(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(
            @PathVariable long id){
        productRepository.deleteById(id);
    }
}
