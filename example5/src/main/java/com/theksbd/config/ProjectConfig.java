package com.theksbd.config;

import com.theksbd.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Bean(name = "mercedesVehicle")
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mercedes Benz");
        return vehicle;
    }

    @Bean(value = "fordVehicle")
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ford Ranger");
        return vehicle;
    }

    /*
    * Primary annotation is used to give a higher preference to a bean when there are multiple beans of the same type.
    * */
    @Primary
    @Bean("chevroletVehicle")
    Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Chevrolet Colorado");
        return vehicle;
    }
}
