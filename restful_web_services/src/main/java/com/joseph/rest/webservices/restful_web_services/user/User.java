package com.joseph.rest.webservices.restful_web_services.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity(name="user_details")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min=10 , message= "Name should have at least 10 characters")
    @JsonProperty("user_name")
    private String name;
    @Past (message = "The Birth Date should be in the past")
    @JsonProperty("birth_date")
    private LocalDate birthDate;
    @Email
    private String email;

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public User(Integer id, String name, LocalDate birthDate, String email) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email= email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
