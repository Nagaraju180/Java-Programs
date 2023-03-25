package com.ynr.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Pizza implements Comparable<Pizza>{
  double price;
  int size;
public Pizza(double price, int size) {
	super();
	this.price = price;
	this.size = size;
}
  public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new Pizza(90,15));
	al.add(new Pizza(100,14));
	al.add(new Pizza(150,20));
	al.add(new Pizza(200,22));
	
	Collections.sort(al);
	System.out.println(al);
}
   @Override
   public int compareTo(Pizza o) {
	  if(this.size>o.size) {
		  return -1;
	  }
	  else if(this.size<o.size) {
		  return +1;
	  }
	   return 0;
   }
@Override
public String toString() {
	return "Pizza ="+ size + "]";
}
   
}
