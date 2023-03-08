package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P19 {

		public static void main(String[] args) {
	       Scanner scn=new Scanner(System.in);
	       System.out.println("Enter a number");
	       int num=scn.nextInt();
	       
	       for(int r=1;r<=num;r++) {
	    	   for(int i=num-r;i>0;i--) {
	    		   System.out.print(" ");
	    	   }
	    	   for(int j=1;j<=r;j++) {
	    		   System.out.print("*");
	    	   }
	    	   System.out.println();
	       }
		}

	
}
