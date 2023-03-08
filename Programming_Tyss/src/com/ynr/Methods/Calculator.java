package com.ynr.Methods;

import java.util.Scanner;
public class Calculator {

	 static void add() {
  	  int a=10;
  	  int b=20;
  	  System.out.println(a+b);
  	  
     }
	 static void sub() {
		int i=50;
		int j=13;
		System.out.println(i-j);
	 }
	static void pro() {
		int x=4;
		int y=6;
		System.out.println(x*y);
	}
	static void div() {
		int n=153;
		int p=5;
		System.out.println(n/p);
	}
	static void rem() {
		int v=1234;
		int u=4;
		System.out.println(v%u);
	}
	static void dis() {
		int r=1000;
		System.out.println(r*5/100);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose you want?");
		System.out.println("1.Add");
		System.out.println("2.Sub?");
		System.out.println("3.product");
		System.out.println("4.div");
		System.out.println("5.rem");
		System.out.println("6.dis");
		
		int num=sc.nextInt();
		switch(num){
		case 1: add();
		break;
		case 2: sub();
		break;
		case 3: pro();
		break;
		case 4: div();
		break;
		case 5: rem();
		break;
		case 6: dis();
		break;
		}
	}

}
