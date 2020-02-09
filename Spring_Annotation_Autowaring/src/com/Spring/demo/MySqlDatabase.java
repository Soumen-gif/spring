package com.Spring.demo;

import org.springframework.stereotype.Component;

@Component
public class MySqlDatabase
{
	public MySqlDatabase() 
	{
		System.out.println("Mysql database creatted");
		
	}
  public void saveObject()
  {
	  System.out.println("Object saved using MYSQL implementation");
	  
	  
	  
  }
}
