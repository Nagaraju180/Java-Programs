package com.ynr.Basicpack1;

import java.util.Scanner;

public class P50 {
//4.5% bonus for the employers
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter ur sal and years of service");
	      int sal=sc.nextInt();
	      int y=sc.nextInt();
	      
	      if(y>5) {
	    	  int bonus=sal*5/100;
	    	  System.out.println(bonus);
	      }else {
	    	  System.out.println("Your not eligible for bonus");
	      }
	}

}
