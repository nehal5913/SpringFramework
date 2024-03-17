package com.springcore.javaconfigbean;

public class Student {
	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public void message()
	{
		this.samosa.mess();
		System.out.println("This object is created without xml and with @Bean annotation");
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
}
