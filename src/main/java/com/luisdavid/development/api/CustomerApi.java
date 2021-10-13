/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.api;

import com.luisdavid.development.model.Customer;
import com.luisdavid.development.service.CustomerService;
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
@RequestMapping("customer")
public class CustomerApi {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    @RequestMapping("findAll")
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }
    
    @GetMapping
    @RequestMapping("count")
    public long count() {
        return customerService.count();
    }
}
