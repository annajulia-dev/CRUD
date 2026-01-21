package com.base.base.controller;

import com.base.base.model.Product;
import com.base.base.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping
    public String listOfProducts(Model model){
        model.addAttribute("productsList", productRepository.findAll());
        return "index.html";
    }

    @PostMapping("/save")
    public String addNewProduct(@ModelAttribute Product product){
        productRepository.save(product);
        return "redirect:/products";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") Long id){
        productRepository.deleteById(id);
        return "redirect:/products";
    }
}
