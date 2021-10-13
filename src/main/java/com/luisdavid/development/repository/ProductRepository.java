/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.repository;

import com.luisdavid.development.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author SyntaxErrorr
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
