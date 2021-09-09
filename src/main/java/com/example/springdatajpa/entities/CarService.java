package com.example.springdatajpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "SERVICE", uniqueConstraints = {@UniqueConstraint(columnNames = "serviceName")})
public class CarService {

    @Id
    @GeneratedValue
    private Long serviceId;
    private String serviceName;

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    public long getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(long serviceCost) {
        this.serviceCost = serviceCost;
    }

    private long serviceCost;

   public CarService(){

   }
   public CarService(String serviceName, long serviceCost){
       this.serviceName = serviceName;
       this.serviceCost = serviceCost;

   }


}


