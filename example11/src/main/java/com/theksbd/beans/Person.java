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

    /*
     * Autowired annotation marks a constructor, field, setter method, or config method
     * is used to autowire the beans at runtime by Spring's dependency injection mechanism.
     */
    // @Autowired
    private Vehicle vehicle;

//    public Person() {
//        System.out.println("Person bean is created by Spring");
//    }

    /*
    * Autowired annotation marks a constructor, field, setter method, or config method
    * is used to autowire the beans at runtime by Spring's dependency injection mechanism.
    * */
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

    /*
    * Autowired annotation marks a constructor, field, setter method, or config method
    * is used to autowire the beans at runtime by Spring's dependency injection mechanism.
    * */
    // @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
