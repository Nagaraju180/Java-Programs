package com.ynr.Assingments;

import java.util.Scanner;

public class HaloSq_pattern1 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      
      for(int r=1;r<=num;r++) {
    	  for(int c=1;c<=num;c++) {
    		  if(r==1||r==num||c==1||c==num) {
    			  System.out.print("*");
    		  }else System.out.print(" ");
    	  }
    	  System.out.println();
      }
      
	}

}
