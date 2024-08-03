package com.theksbd.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/*
 * Component annotation is used to declare a bean in the Spring container.
 * The class annotated with @Component will be registered as a bean in the Spring application context.
 * */
@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle class");
    }

    @PostConstruct
    public void initialize() {
        this.name = "VinFast";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Vehicle bean");
    }
}
