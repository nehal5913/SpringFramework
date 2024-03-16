package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	@Value("1")
	private Integer kgs;
	
	@Value("1000")
	private Integer price;
	
	@Value("Vanilla")
	private String flavour;
	
	@Value("#{temp}")
	private List<String> ingredients;
	
	public Integer getKgs() {
		return kgs;
	}
	
	public void setKgs(Integer kgs) {
		this.kgs = kgs;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getFlavour() {
		return flavour;
	}
	
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Order [kgs=" + kgs + ", price=" + price + ", flavour=" + flavour + ", ingredients=" + ingredients + "]";
	}
	
	
}
