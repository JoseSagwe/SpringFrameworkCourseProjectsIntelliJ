package com.springboot.jpahibernate.learningjpaandhibernate.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
                    INSERT INTO course(id, name, author) VALUES (? , ?, ?);
                                        
                    """;

    private static String DELETE_QUERY =
            """                
                    DELETE FROM course WHERE id=?;
                                        
                    """;

    private static String SELECT_QUERY =
            """                
                    SELECT * FROM course WHERE id=?;
                                        
                    """;



    public void insert(CourseSpecificationClass course){
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        jdbcTemplate.update(DELETE_QUERY,id);
    }

    public CourseSpecificationClass findById(long id){
        //Result => Bean => Row Mapper
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(CourseSpecificationClass.class), id);
    }



}
