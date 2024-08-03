package com.theksbd.main;

import com.theksbd.beans.Vehicle;
import com.theksbd.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle: " + vehicle.getName());
        vehicle.printHello();
        context.close();
    }
}