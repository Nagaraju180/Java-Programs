package com.ynr.PatternPrgms;

import java.util.Scanner;
//Printing Odd pos "1" &even pos "0"
public class P4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	    
	      for(int r=1;r<=num;r++) {
	    	  for(int c=1;c<=num;c++) {
	    		  if(c%2==0) System.out.print("0");
	    		  else System.out.print("1");
	    	  }
	    	  System.out.println();
	      }
	}

}
