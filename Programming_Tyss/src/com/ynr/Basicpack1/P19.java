package com.ynr.Basicpack1;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter 3 inputs");
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      int c=sc.nextInt();
	      if(a*a+b*b==c*c||c*c+b*b==a*a||a*a+b*b==c*c) {
	    	  System.out.println("Pythagorous");
	      }
	      else {
	    	  System.out.println("not a pythagorous ");
	      }
	}

}
