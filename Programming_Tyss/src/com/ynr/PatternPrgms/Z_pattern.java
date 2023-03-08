package com.ynr.PatternPrgms;

import java.util.Scanner;

public class Z_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a num");
	      int num=sc.nextInt();
	      
	      for(int r=1;r<=num;r++) {
	    	  for(int c=1;c<=num;c++) {
	    		  if(r==1||r==num||r+c==num+1)
	    			  System.out.print("*");
	    		  else System.out.print(" ");
	    	  }
	    	  System.out.println();
	      }
	}

}
