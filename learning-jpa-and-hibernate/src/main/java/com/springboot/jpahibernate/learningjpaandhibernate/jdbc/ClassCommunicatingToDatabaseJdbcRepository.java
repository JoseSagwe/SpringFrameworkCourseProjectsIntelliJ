package com.springboot.jpahibernate.learningjpaandhibernate.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClassCommunicatingToDatabaseJdbcRepository {

    //JdbcTemplate is used to fire Query

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ClassCommunicatingToDatabaseJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static String INSERT_QUERY =
            """                
                    INSERT INTO course(id, name, author) VALUES (5, 'CyberSecurity', 'Developer Dante');
                                        
                    """;

    public void insert(){
        jdbcTemplate.update(INSERT_QUERY);
    }

}
