package com.jsprojects.learningspringframework.hellospring;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App02HelloWorldSpring{

	public static void main(String[] args) {
		
		//the try with resources is used due to resource leak

		try (var context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class)) //resource
		{
			//using bean class to retrieve the objects
			System.out.println(context.getBean("name"));
			System.out.println("The addition result is " + context.getBean("add"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("customerAddress"));
			System.out.println(context.getBean("person1")); // injecting methods of existing beans
			System.out.println(context.getBean("person2")); //injecting bean names parameters
			
			//You can use also the class name context
			System.out.println(context.getBean(Address.class));
			
            //Listing all the Beans managed by Spring Container
			System.out.println("The beans are as follows:");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
