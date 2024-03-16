package com.springcore.standalone.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class Information {
	private List<String> names;
	private HashMap<String,Integer> feeStructure;
	private Properties properties;  
	
	@Override
	public String toString() {
		return "Information [names=" + names + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getNames() {
		return names;
	}
	
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public HashMap<String, Integer> getFeeStructure() {
		return feeStructure;
	}
	
	public void setFeeStructure(HashMap<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}
	
}
