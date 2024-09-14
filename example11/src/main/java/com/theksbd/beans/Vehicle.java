package com.theksbd.beans;

import org.springframework.stereotype.Component;

/*
 * Component annotation is used to declare a bean in the Spring container.
 * The class annotated with @Component will be registered as a bean in the Spring application context.
 * */
@Component
public class Vehicle {
    private String name = "Vin Fast";

    public Vehicle() {
        System.out.println("Vehicle bean is created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is: " + name;
    }
}
