package com.ynr.Basicpack1;

import java.util.Scanner;

public class P28 {
//Prime number program
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=sc.nextInt();
      boolean flag=true;
      for(int i=2;i<=num/2;i++) {
    	  if(num%i==0) {
    		  System.out.println(num+" not a prime number");
    		  flag=false;
    		  break;
    	  }
      }if(flag) System.out.println(num+" is a prime number");
	}

}
