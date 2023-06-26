package com.example.firstrestapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/course")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(new Course(1,"Spring Boot","Navin Reddy"),
                new Course(2,"Aws","In28Minutes"));
    }

}
