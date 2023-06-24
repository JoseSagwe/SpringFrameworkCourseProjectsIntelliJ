package com.jsprojects.learningspringframework.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//The record keyword in Java is a feature introduced in Java 14 that provides a concise and convenient way to define classes that are primarily used to store and retrieve data. It combines the features of a class and an immutable data container, reducing the boilerplate code typically associated with creating simple data-holding classes.
record Person (String name, int age, Address address) {}

record Address (String City, String Country) {}


@Configuration
public class HelloworldConfiguration {

	 @Bean
	    public String name(){
	        return "Developer Joseph";
	    }
	 @Bean
	    public int age(){
	        return 21;
	    }
	 
	 @Bean
	 public int add() {
		 int m= 5 ;
		 int n = 10;
		 
		 return m + n;
	 }
	 
	 @Bean
	 public Person person() {
		 return new Person("Joseph", 21, new Address("Mombasa", "Kenya"));
	 }
	 
	 //Creating bean name to suit your need, do it on the annotation
	 @Bean(name = "customerAddress")
	 public Address address() {
		 return new Address("Nairobi", "Kenya");
	 }
	 
	 

	    //Using already existing beans to create other beans.
	    // 1. By calling methods directly, injecting the methods of existing beans
	    @Bean(name = "person1")
	    public Person personMethodInjection(){
	        return new Person(name(),age(), address());
	    }

	    //2. By passing/injecting parameters or bean names of the existing beans
	    @Bean(name = "person2")
	    public Person personBeanName(String name, int age, Address customerAddress){
	        return new Person(name, age, customerAddress);
	    }
	 
}
