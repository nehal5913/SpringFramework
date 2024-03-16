package com.springcore.ci;

import java.util.List;

public class Person {

	private String name;
	private int personId;
	private List<String> blah;
	
	public Person(String name, int personId, List<String> blah) {
		super();
		this.name = name;
		this.personId = personId;
		this.blah = blah;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", blah=" + blah + "]";
	}
	
	
}
