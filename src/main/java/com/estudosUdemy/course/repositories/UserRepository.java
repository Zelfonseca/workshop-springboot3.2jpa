package com.estudosUdemy.course.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.estudosUdemy.course.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{

}
