package com.mca.spring;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext  app = new ClassPathXmlApplicationContext("config2.xml");
		
		Student student = (Student) app.getBean("stud");
		student.play();
		app.close();
	}
}
