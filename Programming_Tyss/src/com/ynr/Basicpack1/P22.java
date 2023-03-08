package com.ynr.Basicpack1;

import java.util.Scanner;
   //3 Nested if
public class P22 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Ur age:");
	      int age=sc.nextInt();
	      System.out.println("Enter ur weight:");
	      int weight=sc.nextInt();
	      
	      if(age>25) {
	    	  if(weight>60) {
	    		  System.out.println("You are eligible for boxing competition");
	    	  }else {
	    		  System.out.println("You are not eligible for boxing competition");
	    	  }
	      }else {
	    	  System.out.println("Under age-Not eligible!!");
	      }
	}

}
