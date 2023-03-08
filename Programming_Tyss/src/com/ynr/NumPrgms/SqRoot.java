package com.ynr.NumPrgms;

import java.util.Scanner;

public class SqRoot {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      
      for(int i=1;i<=num/2;i++) {
    	  if(i*i==num) {
    		  System.out.println("SqRoot of "+num+" is "+i);
    		  break;
    	  }
    	  
      }
	}

}
