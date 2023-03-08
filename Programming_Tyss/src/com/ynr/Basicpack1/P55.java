package com.ynr.Basicpack1;

import java.util.Scanner;

public class P55 {
//1. check if a number start with an even number
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=sc.nextInt();
      
      int rev=0;
      int rem;
      while(num>0) {
    	  rem=num%10;
    	  rev=(rev*10)+rem;
    	  num/=10;
      }
      int res=rev%10;
      if(res%2==0) System.out.println("Start with an even");
      else System.out.println("Not started with an even");
	}

}
