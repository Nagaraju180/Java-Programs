package com.ynr.Assingments;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      int count=1;
	      for(int r=1;r<=num;r++) {
	    	  for(int c=1;c<=r;c++) {
	    		 System.out.print(count);
	    		 count++;
	    	  }
	    	  System.out.println();
	      }
	}

}
