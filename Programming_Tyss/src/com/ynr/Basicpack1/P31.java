package com.ynr.Basicpack1;

import java.util.Scanner;

public class P31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number:");
	      int num=sc.nextInt();
	      int temp=num;
	      int rev=0;
	      int rem;
	      while(num>0) {
	    	  rem=num%10;
	    	  rev=(rev*10)+rem;
	    	  num/=10;
	      }
	      if(temp==rev) System.out.println("Palindrome");
	      else System.out.println("Not a palindrome");
	}

}
