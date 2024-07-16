package com.theksbd.main;

import com.theksbd.beans.Vehicle;
import com.theksbd.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("VinFast");
        System.out.println("Vehicle name from non-spring context: " + vehicle.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context: " + vehicle1.getName());
        String hello = context.getBean(String.class);
        System.out.println("Hello from spring context: " + hello);
        Integer number = context.getBean(Integer.class);
        System.out.println("Number from spring context: " + number);
    }
}