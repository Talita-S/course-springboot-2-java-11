package com.fatec.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
