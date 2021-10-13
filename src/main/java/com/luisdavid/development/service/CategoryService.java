/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.service;

import com.luisdavid.development.model.Category;
import com.luisdavid.development.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SyntaxErrorr
 */    
@Service
public class CategoryService  {

    @Autowired
    private CategoryRepository categoryRepository;

    
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    
    public long count(){
        return categoryRepository.count();
    }
}