package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		Information info = (Information) context.getBean("test");
		System.out.println(info);
		System.out.println(info.getNames().getClass().getName());
		System.out.println(info.getFeeStructure().getClass().getName());
		System.out.println(info.getProperties().getClass().getName());
	}

}
