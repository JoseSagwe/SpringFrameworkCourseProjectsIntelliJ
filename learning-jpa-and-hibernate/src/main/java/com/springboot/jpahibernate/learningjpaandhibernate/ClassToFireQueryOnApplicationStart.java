package com.springboot.jpahibernate.learningjpaandhibernate;

import com.springboot.jpahibernate.learningjpaandhibernate.SpringDataJPA.LaptopClassSpecificationsEntity;
import com.springboot.jpahibernate.learningjpaandhibernate.SpringDataJPA.SpringDataJPARepository;
import com.springboot.jpahibernate.learningjpaandhibernate.jdbc.ClassCommunicatingToDatabaseJdbcRepository;
import com.springboot.jpahibernate.learningjpaandhibernate.jpa.PhoneClassSpecifications;
import com.springboot.jpahibernate.learningjpaandhibernate.jpa.RepositoryClassCommunicatingWithDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClassToFireQueryOnApplicationStart implements CommandLineRunner {
    //CommandLineRunner Is aon Interface used to run a logic on Application Start

    //Course class
    //ClassCommunicatingToDatabaseJdbcRepository repository;
//    @Autowired
//    public ClassToFireQueryOnApplicationStart(ClassCommunicatingToDatabaseJdbcRepository repository) {
//        this.repository = repository;
//    }


    //phone class Repository
//    RepositoryClassCommunicatingWithDatabase repository;
//    @Autowired
//    public ClassToFireQueryOnApplicationStart(RepositoryClassCommunicatingWithDatabase repository) {
//        this.repository = repository;
//    }


    //Phone data
//    @Override
//    public void run(String... args) throws Exception {
//        repository.insert(new PhoneClassSpecifications(1,"Iphone",120000));
//        repository.insert(new PhoneClassSpecifications(2,"Tecno",42000));
//        repository.insert(new PhoneClassSpecifications(3,"Samsung",34000));


        //laptop data


    SpringDataJPARepository repository;

    @Autowired
    public ClassToFireQueryOnApplicationStart(SpringDataJPARepository repository) {
        this.repository = repository;
    }

    @Override
        public void run(String... args) throws Exception {
            repository.save(new LaptopClassSpecificationsEntity(1,"HP laptop",12000000));
            repository.save(new LaptopClassSpecificationsEntity(2,"Macbook",4200000));
            repository.save(new LaptopClassSpecificationsEntity(3,"Lenovo",3400000));
        //Delete Query
        repository.deleteById(1L);
//
        //select Query
        System.out.println( repository.findById(1L));
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findById(4L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByName("Lenovo"));
    }



}
