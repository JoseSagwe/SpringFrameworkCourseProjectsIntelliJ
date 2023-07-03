package com.joseph.rest.webservices.restful_web_services.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDataAccessObjectService {
    //implement methods findAll()/ save /findOne

    //Static arrayList

    private static int usersCount=0;
    private  static List<User> users = new ArrayList<>();

    static {
        users.add(new User(++usersCount, "Joseph", LocalDate.now().minusYears(30), "@josephsagwe" ));
        users.add(new User(++usersCount, "Sagwe", LocalDate.now().minusYears(32),"@josephsagwe"));
        users.add(new User(++usersCount, "Birisio", LocalDate.now().minusYears(20), "@josephsagwe" ));
    }



    public List<User> findAll(){
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User saveUser(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
