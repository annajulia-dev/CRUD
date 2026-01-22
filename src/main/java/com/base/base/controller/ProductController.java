package com.base.base.controller;

import com.base.base.model.Category;
import com.base.base.model.Product;
import com.base.base.repository.CategoryRepository;
import com.base.base.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductController(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public String listOfProducts(Model model){
        model.addAttribute("categories", categoryRepository.findAll());
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
