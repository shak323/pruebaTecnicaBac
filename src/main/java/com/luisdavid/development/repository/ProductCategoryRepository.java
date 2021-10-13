/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luisdavid.development.repository;

import com.luisdavid.development.dto.ProductCategoryResult;
import com.luisdavid.development.model.ProductCategory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author SyntaxErrorr
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    @Query(value = "SELECT pc.id, pc.id_category, pc.id_product, c.description AS description_category, c.name AS name_category, p.creation_date, p.description as description_product, p.expired_date, p.name as name_product, p.price FROM product_category pc JOIN category c ON c.id = pc.id_category JOIN product p ON p.id = pc.id_product", nativeQuery = true)
    List<ProductCategoryResult> query();

}
