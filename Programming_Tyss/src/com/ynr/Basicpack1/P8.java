package com.ynr.Basicpack1;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a number:");
	      int num=scn.nextInt();
	       
	      if(num>=0) {
	    	  System.out.println(num+" is a positive number");
	      }
	      else {
	    	  System.out.println(num+" is a negitive number");
	      }
	}

}
