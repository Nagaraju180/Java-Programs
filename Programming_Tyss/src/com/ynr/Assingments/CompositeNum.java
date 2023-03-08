package com.ynr.Assingments;

import java.util.Scanner;

public class CompositeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	       boolean flag=true;
	      for(int i=1;i<=num/2;i++) {
	    	  if(num%i==0) {
	    		  System.out.println(num+"Composite num");
	    		  flag=false;
	    		  break;
	    	  }
	      }if(flag)System.out.println(num+"not a composite num");
	      
	      
	}

}
