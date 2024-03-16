package com.springcore.ref;

public class A {
	private int o;
	private B ob;
	@Override
	public String toString() {
		return "A [o=" + o + ", ob=" + ob + "]";
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int o, B ob) {
		super();
		this.o = o;
		this.ob = ob;
	}
	public int getO() {
		return o;
	}
	public void setO(int o) {
		this.o = o;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
}
