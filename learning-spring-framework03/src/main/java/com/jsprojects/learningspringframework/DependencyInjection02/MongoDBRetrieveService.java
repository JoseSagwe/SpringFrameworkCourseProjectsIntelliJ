package com.jsprojects.learningspringframework.DependencyInjection02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBRetrieveService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {7, 8, 9, 18, 17};
    }
}
