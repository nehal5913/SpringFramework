package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subjects {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subjects [name=" + name + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Inside init: subject");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Inside destroy: subject");
	}
}
