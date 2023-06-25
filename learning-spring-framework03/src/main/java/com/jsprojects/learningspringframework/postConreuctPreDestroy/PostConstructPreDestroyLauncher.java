package com.jsprojects.learningspringframework.postConreuctPreDestroy;

import com.jsprojects.learningspringframework.DependencyInjection02.BusinessCalculationService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeClassDependency dependency;

    public SomeClass(SomeClassDependency dependency) {
        this.dependency = dependency;
        System.out.println("Dependency is injected and ready for use");// here the class is eagerly initialized
    }

    @PostConstruct
    public void useDependencyFirst(){
        dependency.getReady();
        System.out.println("Dependency is used first by using @PostConstruct");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Here all resources are cleaned up after use eg database using @PreDestroy");
    }

}
@Component
class SomeClassDependency{
    public void getReady(){
        System.out.println("Some LOGIC");
    }
}

@Configuration
@ComponentScan
public class PostConstructPreDestroyLauncher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PostConstructPreDestroyLauncher.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
