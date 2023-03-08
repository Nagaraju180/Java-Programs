package com.ynr.Methods;

public class Product {

	public static void main(String[] args) {
       int n=3;
       System.out.println(product(n));
	}

	private static int product(int n) {
		if(n<=1) return n;
		else return n*product(n-1);
	}

}
