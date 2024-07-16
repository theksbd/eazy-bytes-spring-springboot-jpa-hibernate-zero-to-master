package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Spring Configuration annotation is a part of the spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition methods.
 * So Spring container can process the class and generate Spring Beans to be used in the application.
 * */
@Configuration
public class ProjectConfig {
    /*
    * The method name usually is a verb.
    * But in this case, the method name is a noun.
    * This is a good practice as the method name will become the bean name in the Spring container/context.
    * */

    /*
    * Bean annotation is used to declare a bean in the Spring container.
    * The method annotated with @Bean will return an object.
    * That object will be registered as a bean in the Spring application context.
    * */
    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mercedes Benz");
        return vehicle;
    }

    @Bean
    String hello() {
        return "Hello World!";
    }

    @Bean
    Integer number() {
        return 1909;
    }
}
