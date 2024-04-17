package com.prem.springboot_crud.repository;

import com.prem.springboot_crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Object> findByName(String name);
}
