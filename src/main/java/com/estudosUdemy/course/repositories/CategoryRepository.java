package com.estudosUdemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosUdemy.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
