package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//Samosa s = (Samosa) context.getBean("s1");
		//System.out.println(s);
		context.registerShutdownHook();
		
		//Pepsi p = (Pepsi)context.getBean("p1");
		
		//System.out.println(p);
		
		Subjects ss = (Subjects) context.getBean("ss");
		System.out.println(ss);
	}

}
