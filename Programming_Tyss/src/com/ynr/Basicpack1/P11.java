package com.ynr.Basicpack1;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter u r percentage:");
	      int per=scn.nextInt();
	      
	      if(per>=85) {
	    	  System.out.println("you are distinction");
	      }
	      else if(per>=35 && per<=85) {
	    	  System.out.println("First class");
	      }
	      else
	      {
	    	  System.out.println("you are failed!!");
	      }
	}

}
