package com.ynr.Basicpack1;

import java.util.Scanner;
           //4
public class P23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter your Year:");
	      int year=sc.nextInt();
	      System.out.println("Enter your percentage:");
	      int per=sc.nextInt();
	      
	      if(year==2) {
	    	  if(per>=80) {
	    		  System.out.println("Distinction");
	    	  }else if(per>=60 && per<=80) {
	    		  System.out.println("First class");
	    	  }else if(per>=35 && per<=60) {
	    		  System.out.println("second class");
	    	  }else {
	    		  System.out.println("Failed");
	    	  }
	      }else {
	    	  System.out.println("Not a student of 2nd year");
	      }
	}

}
