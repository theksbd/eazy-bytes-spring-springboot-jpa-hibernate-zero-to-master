package com.theksbd.main;

import com.theksbd.beans.Person;
import com.theksbd.beans.Vehicle;
import com.theksbd.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}