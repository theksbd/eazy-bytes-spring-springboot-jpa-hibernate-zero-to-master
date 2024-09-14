package com.theksbd.config;

import com.theksbd.beans.Person;
import com.theksbd.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Spring Configuration annotation is a part of the spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition methods.
 * So Spring container can process the class and generate Spring Beans to be used in the application.
 * */
@Configuration
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vin Fast");
        return vehicle;
    }

    /*
    * We are injecting Vehicle bean into Person bean using method parameter.
    * */
    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Hoang");
        person.setVehicle(vehicle);
        return person;
    }
}
