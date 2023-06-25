package com.jsprojects.learningspringframework.DependencyInjection01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//The amin class that the dependency will be injected
@Component
class PersonMainClass{

//	@Autowired //Field Injection
	private  final PersonDependency1 nameDep1;
//	@Autowired //Field Injection
private  final PersonDependency2 ageDep2;


	//Constructor Injection(RECOMMENDED)
	@Autowired
	public PersonMainClass(PersonDependency1 nameDep1, PersonDependency2 ageDep2) {
		this.nameDep1 = nameDep1;
		this.ageDep2 = ageDep2;
		System.out.println("My name is " + nameDep1.personName());
		System.out.println("My age is " + ageDep2.age());
	}

	//Setter Injection
//
//	@Autowired
//	public void setNameDep1(PersonDependency1 nameDep1) {
//		this.nameDep1 = nameDep1;
//	}
//
//	@Autowired
//	public void setAgeDep2(PersonDependency2 ageDep2) {
//		this.ageDep2 = ageDep2;
//	}

	//toString to print the dependency used
	public String toString() {
		return "PersonMainClass{" +
				"nameDep1=" + nameDep1 +
				", ageDep2=" + ageDep2 +
				'}';
	}
}

//DEPENDENCY CLASSES
@Component
class PersonDependency1{
	public String personName(){
		return "Joseph Sagwe";
	}
}

//Dependency 1
@Component
class PersonDependency2{
	public int age(){
		return 21;
	}
}

//Dependency 2


@Configuration
@ComponentScan
public class DependencyInjectionLauncher {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectionLauncher.class);


		//Listing All Beans
		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}

		System.out.println(context.getBean(PersonMainClass.class));


	}

}
