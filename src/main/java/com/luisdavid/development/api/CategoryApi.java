/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.api;

import com.luisdavid.development.model.Category;
import com.luisdavid.development.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SyntaxErrorr
 */
@RestController
@RequestMapping("category")
public class CategoryApi {
    
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping
    @RequestMapping("findAll")
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok(categoryService.findAll());
    }
    
    @GetMapping
    @RequestMapping("count")
    public long count() {
        return categoryService.count();
    }
}
