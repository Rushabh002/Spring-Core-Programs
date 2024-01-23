package com.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Emp emp1 = (Emp) context.getBean("Emp1");
		System.out.println(emp1);
	}
}
