package com.fatec.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
