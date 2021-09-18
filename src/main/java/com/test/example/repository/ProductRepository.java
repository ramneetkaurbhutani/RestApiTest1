package com.test.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.example.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

}
