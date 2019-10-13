package com.jm.kwejk.controller;

import com.jm.kwejk.model.Category;
import com.jm.kwejk.model.Gif;
import com.jm.kwejk.repository.CategoryRepository;
import com.jm.kwejk.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    GifRepository gifRepository;

    @GetMapping("/categories")
    public String gifCategories(ModelMap modelMap){

        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);

        return "categories";

    }

    @GetMapping("/category/{id}")
    public String getGifsByCategory(@PathVariable int id, ModelMap modelMap) {
        // 1. pobranie potrzebnych obiektów
        // - pobieramy Liste gifów należacych do danej kategorii
        List<Gif> gifList = gifRepository.getGifsByCategoryId(id);
        Category category = categoryRepository.getCategoryById(id);

        // 2. przekazanie do view
        modelMap.put("gifs", gifList);

        modelMap.put("category", category);
        // 3. zwracanie widoku

        return "category";
    }

}
