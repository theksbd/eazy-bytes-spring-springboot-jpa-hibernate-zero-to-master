package com.theksbd.main;

import com.theksbd.config.ProjectConfig;
import com.theksbd.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1 : " + vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " + vehicleServices2.hashCode());
        if (vehicleServices1 == vehicleServices2) {
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }
    }
}
