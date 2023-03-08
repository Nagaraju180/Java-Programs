package com.ynr.Basicpack1;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a number:");
	      int num=scn.nextInt();
	      if(num%6==0) {
	    	  System.out.println(num+" is divisable by 6");
	      }
	      else {
	    	  System.out.println(num+" not divisiable by 6");
	      }
	}

}
