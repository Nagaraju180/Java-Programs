package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P32 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      
	      for(int r=(-num)+1;r<num;r++) {
	    	  if(r<0) {
	    		  r=-r;
	    	  }
	      }
   }
}
