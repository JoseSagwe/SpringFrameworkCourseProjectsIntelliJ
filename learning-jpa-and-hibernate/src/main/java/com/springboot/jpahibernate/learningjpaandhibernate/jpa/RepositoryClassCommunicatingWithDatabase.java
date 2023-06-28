package com.springboot.jpahibernate.learningjpaandhibernate.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class RepositoryClassCommunicatingWithDatabase {
    @PersistenceContext   //same As Autowired but specific to Entity Manager
    EntityManager entityManager;

    public  void insert(PhoneClassSpecifications phone){
        entityManager.merge(phone);
    }

    public  PhoneClassSpecifications findById(long id){
      return  entityManager.find(PhoneClassSpecifications.class, id);
    }
//
    public  void deleteById(long id){
        PhoneClassSpecifications phone = entityManager.find(PhoneClassSpecifications.class, id);
        entityManager.remove(phone);
    }

}
