package com.demos.stddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/demos/stddemo/config2.xml");
      Object obj = context.getBean("std");
      Student std = (Student) obj;
      System.out.println("Age: "+std.getAge());
    }
}
