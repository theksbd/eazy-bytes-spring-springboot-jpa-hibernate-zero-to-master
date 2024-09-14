package com.theksbd.main;

import com.theksbd.beans.Person;
import com.theksbd.beans.Vehicle;
import com.theksbd.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example9 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring context: " + person.getName());
        System.out.println("Vehicle name from Spring context: " + vehicle.getName());
        System.out.println("Vehicle that Person owns: " + person.getVehicle());
    }
}