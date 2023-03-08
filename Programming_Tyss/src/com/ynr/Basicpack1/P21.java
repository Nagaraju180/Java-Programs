package com.ynr.Basicpack1;

import java.util.Scanner;
                   // 2 using nested if
public class P21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter User Name:");
	      int num=sc.nextInt();
	      
	      if(num>100) {
	    	  if(num<200) {
	    		  System.out.println(num+" The num is in the range 100 to 200");
	    	  }else {
	    		  System.out.println(num+" Not in the range 100 to 200");
	    	  }
	      }else {
	    	  System.out.println(num+" is lesser than 100");
	      }
	}

}
