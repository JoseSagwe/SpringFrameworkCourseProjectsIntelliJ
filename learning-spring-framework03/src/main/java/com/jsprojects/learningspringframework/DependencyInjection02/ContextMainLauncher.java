package com.jsprojects.learningspringframework.DependencyInjection02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class ContextMainLauncher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextMainLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}
