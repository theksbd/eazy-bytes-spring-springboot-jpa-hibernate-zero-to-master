package com.theksbd.beans;

import com.theksbd.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Component annotation is used to declare a bean in the Spring container.
 * The class annotated with @Component will be registered as a bean in the Spring application context.
 * */
@Component
public class Vehicle {
    private String name = "Vin Fast";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle bean");
    }

    @Override
    public String toString() {
        return "Vehicle name is: " + name;
    }
}
