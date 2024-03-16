package com.springcore;

public class Customer {
	private String customerName;
	private int customerNumber;
	private int orderSize;
	private int customerAge;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getOrderSize() {
		return orderSize;
	}
	public void setOrderSize(int orderSize) {
		this.orderSize = orderSize;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public Customer(String customerName, int customerNumber, int orderSize, int customerAge) {
		super();
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.orderSize = orderSize;
		this.customerAge = customerAge;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerNumber=" + customerNumber + ", orderSize="
				+ orderSize + ", customerAge=" + customerAge + "]";
	}
	
	
	
	
}
