package com.theksbd.config;

import com.theksbd.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
 * Spring Configuration annotation is a part of the spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition methods.
 * So Spring container can process the class and generate Spring Beans to be used in the application.
 * */
/*
 * ComponentScan annotation is used with the @Configuration annotation to provide a base package for the scanning.
 * It tells Spring to scan the com.theksbd.beans package for annotated components.
 * The reason why we use @ComponentScan is to tell Spring where to look for Spring Components.
 * Because Spring Context can't scan for Spring Beans in the whole project.
 */
@Configuration
@ComponentScan(basePackages = "com.theksbd.beans")
public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Vin Fast");
        return vehicle;
    }

    @Bean
    @Primary
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ford Ranger");
        return vehicle;
    }

    @Bean
    Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota Fortuner");
        return vehicle;
    }
}
