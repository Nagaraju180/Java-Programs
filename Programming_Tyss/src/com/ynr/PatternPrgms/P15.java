package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      int ch=1;
	      for(int r=1;r<=num;r++) {
	    	  for(int c=1;c<=num;c++) {
	    		  if(r==1||c==1||r==num||c==num) {
	    			  System.out.print(ch);
	    			  ch++;
	    		  }else {
	    			  System.out.print(" ");
	    		  }
	    		  
	    			  
	    	  }
	    	  System.out.println();
	      }
	}

}
