package com.example.springdatajpa.entities;

import javax.persistence.*;


@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue
    private Long carId;
    private String carName;
    private String carYear;
    @ManyToOne
    @JoinColumn(name ="CarService.serviceId")
    private CarService seviceName;

    public Car() {
    }

    public Car(String i10, String s, CarService cs2) {
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCarId() {
        return carId;
    }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }



    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }




}
