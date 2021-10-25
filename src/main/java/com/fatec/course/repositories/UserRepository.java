package com.fatec.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
