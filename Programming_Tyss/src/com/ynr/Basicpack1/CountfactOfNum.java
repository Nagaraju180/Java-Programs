package com.ynr.Basicpack1;

import java.util.Scanner;

public class CountfactOfNum {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int count=0;
      for(int i=1;i<=num;i++) {
    	  if(num%i==0)
    	  {
    		  count++;
    
    	  }
      }
      
      System.out.println(count);
	}

}
