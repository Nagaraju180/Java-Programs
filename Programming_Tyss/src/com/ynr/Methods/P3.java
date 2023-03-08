package com.ynr.Methods;

public class P3 {

	public static void main(String[] args) {

		System.out.println(isPrime(7));
		System.out.println("-----------------");
		System.out.println(factorial(5));
		System.out.println("--------------------");
		fibonacci(10);
		
		
	}
    
	public static boolean isPrime(int num) {
		if(num<1) return false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public static long factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;;
		}
		return fact;
	}
	
	public static void fibonacci(int num) {
		int a=0,b=1,c;
		for(int i=1;i<=num;i++) {
			System.out.println(a+"\t");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
