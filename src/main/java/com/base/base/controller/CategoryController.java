package com.base.base.controller;

import com.base.base.model.Category;
import com.base.base.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @PostMapping("/save")
    public String addNewCategory(@ModelAttribute Category category){
        categoryRepository.save(category);
        return "redirect:/products";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
        return "redirect:/products";
    }
}
