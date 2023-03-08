package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      
	     for(int r=1;r<=num;r++) {
	    	 for(int c=num;c>=r;c--) {
	    		 if((r+c)>num) System.out.print("*");
	    		 else System.out.print(" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
