package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	
	public void message()
	{
		System.out.println("This object is created without xml file configuration!");
	}
}
