package com.jm.kwejk.controller;

import com.jm.kwejk.model.Category;
import com.jm.kwejk.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String gifCategories(ModelMap modelMap){

        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);

        return "categories";

    }

}
