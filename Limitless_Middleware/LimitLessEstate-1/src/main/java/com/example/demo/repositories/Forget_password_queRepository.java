package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Forget_password_que;

@Repository
public interface Forget_password_queRepository extends JpaRepository<Forget_password_que, Integer> {

}
