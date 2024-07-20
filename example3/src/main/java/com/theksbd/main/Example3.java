package com.theksbd.main;

import com.theksbd.beans.Vehicle;
import com.theksbd.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("mercedesVehicle", Vehicle.class);
        Vehicle vehicle2 = context.getBean("fordVehicle", Vehicle.class);
        Vehicle vehicle3 = context.getBean("chevroletVehicle", Vehicle.class);
        System.out.println("Vehicle1: " + vehicle1.getName());
        System.out.println("Vehicle2: " + vehicle2.getName());
        System.out.println("Vehicle3: " + vehicle3.getName());
    }
}