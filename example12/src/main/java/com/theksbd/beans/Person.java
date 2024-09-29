package com.theksbd.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Component annotation is used to declare a bean in the Spring container.
 * The class annotated with @Component will be registered as a bean in the Spring application context.
 * */
@Component
public class Person {
    private String name = "Hoang";
    private Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person bean is created by Spring");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
