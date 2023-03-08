package com.ynr.Methods;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      m2(num);
	}
	static void m2(int num) {
		if(num!=0) {
		System.out.println("Happy birthday");
		m2(num-1);
		}else {
			return;
		}
	}
	
	

}
