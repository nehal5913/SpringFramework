package com.springcore.autowire.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/anno/autoconfig.xml");
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
