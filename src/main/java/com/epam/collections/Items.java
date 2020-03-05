package com.epam.collections;

public class Items {
	
	String name;
	double price;
	Items(String name,double price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		String res="Name is: "+this.name+" Price is: "+this.price;
		return res;
	}

}
