/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.service;

import com.luisdavid.development.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.luisdavid.development.repository.CustomerRepository;
import java.util.List;

/**
 *
 * @author SyntaxErrorr
 */
@Service
public class CustomerService  {

    @Autowired
    private CustomerRepository customerRepository;

    public long count() {
        return customerRepository.count();
    }
    
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
   
}
