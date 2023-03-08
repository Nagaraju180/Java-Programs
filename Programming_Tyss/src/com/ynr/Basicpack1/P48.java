package com.ynr.Basicpack1;

import java.util.Scanner;

public class P48 {
//2.Printing greatest among the numbers
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter length and breadth");
	      int num1=sc.nextInt();
	      int num2=sc.nextInt();
	      
	      String s=num1>num2? num1+" Is greater":num2+" Is greater";
	      System.out.println(s);
	}

}
