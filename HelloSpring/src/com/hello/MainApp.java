package com.hello;

	

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      
	   ApplicationContext context = new ClassPathXmlApplicationContext("com/hello/Beans.xml");
	   
	   HelloSpring obj = (HelloSpring) context.getBean("hello");
      
	   obj.getMessage();
	   
	
   }
}

