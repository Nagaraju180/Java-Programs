package com.ynr.Methods;

public class P2 {

	public static void main(String[] args) {
      System.out.println(add(20,40));  
      System.out.println(add(20.5,40.5));
      System.out.println(add(80,324));
      System.out.println(add('N','R'));
    // System.out.println(add("hello","bye"));
	}
	public static int add(double a,double b) {
		return (int)(a+b);
	}

}
