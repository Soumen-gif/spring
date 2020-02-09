package com.Spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner
{
	public static void main(String[] args) 
	{
		ApplicationContext container= new ClassPathXmlApplicationContext("context.xml");
		System.out.println("container creatted");
		
		MyDemoApp app=container.getBean(MyDemoApp.class);
		app.saveObject();
		
	}

}
