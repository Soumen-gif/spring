package com.Spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// meta info for the container that plz ctreate AN OBJ TO for this particular obj
//of this class with u
@Component
//MyDemoApp mydemoapp= new MyDemoApp();
public class MyDemoApp 
{
	@Autowired
	MySqlDatabase dao;
	
	public void saveObject()
	{
		dao.saveObject();
	}

}
