/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.api;

import com.luisdavid.development.dto.ProductCategoryResult;
import com.luisdavid.development.model.ProductCategory;
import com.luisdavid.development.service.ProductCategoryService;
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
@RequestMapping("productCategory")
public class ProductCategoryApi {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping
    @RequestMapping("findAll")
    public ResponseEntity<List<ProductCategory>> findAll() {
        return ResponseEntity.ok(productCategoryService.findAll());
    }
    
    @GetMapping
    @RequestMapping("count")
    public long count() {
        return productCategoryService.count();
    }
    
    @GetMapping
    @RequestMapping("query")
    public List<ProductCategoryResult> query() {
        return productCategoryService.query();
    }
}
