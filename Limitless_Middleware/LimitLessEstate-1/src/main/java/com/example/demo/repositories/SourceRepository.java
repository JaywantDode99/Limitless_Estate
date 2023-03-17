package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Source;


@Repository
public interface SourceRepository extends JpaRepository<Source, Integer> {

}
