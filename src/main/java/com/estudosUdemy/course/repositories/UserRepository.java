package com.estudosUdemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosUdemy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
