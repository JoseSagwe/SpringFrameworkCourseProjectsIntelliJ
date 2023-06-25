package com.jsprojects.learningspringframework.DependencyInjection02;

import org.springframework.stereotype.Component;

@Component
public class MySQLRetrieveService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1, 4, 20, 17, 6};
    }
}
