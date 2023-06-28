package com.springboot.jpahibernate.learningjpaandhibernate.jdbc;

import com.springboot.jpahibernate.learningjpaandhibernate.Course.CourseSpecificationsClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClassToFireQueryOnApplicationStart implements CommandLineRunner {
    //CommandLineRunner Is aon Interface used to run a logic on Application Start

    ClassCommunicatingToDatabaseJdbcRepository repository;

  @Autowired
    public ClassToFireQueryOnApplicationStart(ClassCommunicatingToDatabaseJdbcRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new CourseSpecificationsClass(1,"Java","Navin2"));
        repository.insert(new CourseSpecificationsClass(2,"Kotlin","Navin"));
        repository.insert(new CourseSpecificationsClass(3,"CyberSecurity","Navin Reddy"));
        repository.insert(new CourseSpecificationsClass(4,"Spring Boot","Navin3"));
        repository.insert(new CourseSpecificationsClass(5,"Android","Navin1000"));

        //Delete Query
        repository.deleteById(5);

        //select Query
        System.out.println( repository.findById(1));
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
        System.out.println(repository.findById(4));
    }


}
