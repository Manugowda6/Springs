package com.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jspiders/config.xml");
		Object obj = context.getBean("s1");
		Student s = (Student) obj;
		
		System.out.println("Id: "+s.getId());
		System.out.println("Name: "+s.getName());
	}
}
