package com.ynr.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel implements Comparable<Hotel>{
	String name;
    double price;
	public Hotel(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
    public static void main(String[] args) {
    	ArrayList al=new ArrayList();
    	
    	al.add(new Hotel("Roti",100));
    	al.add(new Hotel("Idly",40));
    	al.add(new Hotel("Masala Dosa",100));
    	al.add(new Hotel("Fried rice",90));
    	
    	Collections.sort(al);
    	System.out.println(al);

	}
	@Override
	public int compareTo(Hotel o) {
		if(this.price>o.price) {
			return +1;
		}else if(this.price<o.price) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", price=" + price + "]";
	}
	
}
