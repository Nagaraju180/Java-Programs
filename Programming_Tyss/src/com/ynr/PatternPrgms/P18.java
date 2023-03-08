package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      for(int r=5;r>=1;r--) {
	    	  for(int c=5;c>=r;c--) {
	    		  System.out.print(r);
	    	  }
	    	  System.out.println();
	      }
	}

}
