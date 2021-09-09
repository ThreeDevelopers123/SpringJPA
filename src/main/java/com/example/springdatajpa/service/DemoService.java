package com.example.springdatajpa.service;

import com.example.springdatajpa.entities.Car;
import com.example.springdatajpa.entities.CarService;
import com.example.springdatajpa.repository.CarRepository;
import com.example.springdatajpa.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private CarRepository carRepository;

    @Bean
    public CommandLineRunner run(CarRepository carRepository) {
        return (args) -> {
            doIt(carRepository);
            System.out.println(carRepository.findAll());


        };
    }


    public void doIt(CarRepository carRepository) {

        final CarService cs1 = serviceRepository.save(new CarService("Washing", 3000));
        final CarService cs2 = serviceRepository.save(new CarService("Cleaning", 4000));
        final CarService cs3 = serviceRepository.save(new CarService("painting", 2500));
        final CarService cs4 = serviceRepository.save(new CarService("Repairing", 7000));
        final Car car1 = new Car("Audi", "2010", cs1);
        final Car car2 = new Car("I10", "2015", cs2);
        final Car car3 = new Car("Polo", "2005", cs4);
        this.carRepository.save(car1);
        this.carRepository.save(car2);



    }





}
