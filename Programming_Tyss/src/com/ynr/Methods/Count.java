package com.ynr.Methods;

public class Count {

	public static void main(String[] args) {
      int n=10;
      System.out.println(count(n));
	}
	
	static int count(int n) {
		if(n<=1) return n;
		else 
			System.out.println(n);
			return count(n-1);
	}

}
