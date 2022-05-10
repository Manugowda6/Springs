package com.demos.scdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/demos/scdemo/config.xml");
    	Object obj = context.getBean("emp");
    	Employee emp = (Employee) obj;
    	System.out.println("Age: "+emp.getAge());
    	System.out.println("Name "+emp.getName());
    }
}
