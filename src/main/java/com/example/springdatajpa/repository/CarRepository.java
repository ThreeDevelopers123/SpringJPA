package com.example.springdatajpa.repository;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.springdatajpa.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.xml.bind.SchemaOutputResolver;

@Repository
public interface CarRepository extends CrudRepository <Car, Long>{

}
