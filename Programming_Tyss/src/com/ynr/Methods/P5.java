package com.ynr.Methods;

public class P5 {

	public static void main(String[] args) {
		m1(5);
	}

	static void m1(int n) {
		if(n!=0) {
			System.out.println("Well com to TestYantra");
			m1(n-1);
		}else {
			return;
		
		}
		
	}
}
