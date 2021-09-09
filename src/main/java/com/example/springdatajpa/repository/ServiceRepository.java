package com.example.springdatajpa.repository;

import com.example.springdatajpa.entities.CarService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository <CarService, Long> {
}
