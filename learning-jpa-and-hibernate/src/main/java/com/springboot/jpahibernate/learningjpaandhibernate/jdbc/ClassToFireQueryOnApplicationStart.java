package com.springboot.jpahibernate.learningjpaandhibernate.jdbc;

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
        repository.insert();
    }


}
