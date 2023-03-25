package com.ynr.Methods;

public class Prime_recur {

	static int n =9;
	static int h = n / 2+1;
	static int i=2;

	public static void main(String[] args) {
		if (prime(n))
			System.out.println("Prime Number");
		else
			System.out.println("Not prime");

	}

	static boolean prime(int n) {
		if (i==h) {
			return true;
		}
		if (n % i == 0) {
			return false;
		}
			i++;
		
		return prime(n);

	}

}
