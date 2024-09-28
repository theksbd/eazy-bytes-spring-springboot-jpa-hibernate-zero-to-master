package com.theksbd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
}
