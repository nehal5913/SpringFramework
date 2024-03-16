package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Nums {
	
	@Value("#{23+34}")
	private int x;
	
	@Value("#{44>22?2:1}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(23)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	
	@Value("#{new java.lang.String('Nehal')}")
	private String Name;
	
	@Value("#{8>3}")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Nums [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", Name=" + Name + ", isActive=" + isActive
				+ "]";
	}
	
}
