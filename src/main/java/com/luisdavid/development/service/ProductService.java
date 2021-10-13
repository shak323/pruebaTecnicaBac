/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.service;

import com.luisdavid.development.model.Product;
import com.luisdavid.development.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SyntaxErrorr
 */

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public long count() {
        return productRepository.count();
    }
    
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    
    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    public void deleteById(int id) {
       productRepository.deleteById(id);
    }
    
}
