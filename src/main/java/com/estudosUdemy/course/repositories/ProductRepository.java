package com.estudosUdemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosUdemy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
