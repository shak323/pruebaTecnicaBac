/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.service;

import com.luisdavid.development.dto.ProductCategoryResult;
import com.luisdavid.development.model.ProductCategory;
import com.luisdavid.development.repository.ProductCategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SyntaxErrorr
 */
@Service
public class ProductCategoryService {
    
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
            
    public long count() {
        return productCategoryRepository.count();
    }
    
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }
    
    public List<ProductCategoryResult> query() {
        return productCategoryRepository.query();
    }
}
