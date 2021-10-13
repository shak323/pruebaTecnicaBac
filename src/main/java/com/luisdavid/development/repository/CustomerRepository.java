/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.repository;

import com.luisdavid.development.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SyntaxErrorr
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
