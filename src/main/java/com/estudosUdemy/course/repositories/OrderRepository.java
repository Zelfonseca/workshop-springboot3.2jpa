package com.estudosUdemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosUdemy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
