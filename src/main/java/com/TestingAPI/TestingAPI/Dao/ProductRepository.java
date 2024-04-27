package com.TestingAPI.TestingAPI.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TestingAPI.TestingAPI.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,String>{
    public Product findByUUID(String uuid);
    
}