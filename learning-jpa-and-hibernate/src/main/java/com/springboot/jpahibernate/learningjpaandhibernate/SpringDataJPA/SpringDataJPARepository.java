package com.springboot.jpahibernate.learningjpaandhibernate.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataJPARepository extends JpaRepository<LaptopClassSpecificationsEntity,Long> {
//You can make custom methods

    List<LaptopClassSpecificationsEntity> findByName(String name);

}
