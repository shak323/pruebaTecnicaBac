/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.api;

import com.luisdavid.development.model.Product;
import com.luisdavid.development.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SyntaxErrorr
 */
@RestController
@RequestMapping("product")
public class ProductApi {

    @Autowired
    private ProductService productService;

    @GetMapping
    @RequestMapping("findAll")
    public ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }
    
    @GetMapping
    @RequestMapping("count")
    public long count() {
        return productService.count();
    }
    
    @PostMapping
    @RequestMapping("save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }
     
    @DeleteMapping
    @RequestMapping("deleteById")
    public void deleteById(@RequestParam int Id) {
        productService.deleteById(Id);
    }
    
    
}
