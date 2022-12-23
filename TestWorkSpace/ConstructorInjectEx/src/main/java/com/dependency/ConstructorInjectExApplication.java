package com.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependency.ci.Employee;

@SpringBootApplication
public class ConstructorInjectExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorInjectExApplication.class, args);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/dependency/ci/applicationContext.xml");
		Employee e=(Employee) context.getBean("employee");
		e.show();
	}

}
