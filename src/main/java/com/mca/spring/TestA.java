package com.mca.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = (Employee) app.getBean("myEmployee");
		emp.work();
	}
}
