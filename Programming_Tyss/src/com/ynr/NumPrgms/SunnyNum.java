package com.ynr.NumPrgms;

import java.util.Scanner;

public class SunnyNum {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      boolean flag=true;
	       int n=num+1;
	      for(int i=1;i<=n/2;i++) {
	    	  if(i*i==num) {
	    		  flag=false;
	    		  break;
	    	  }  
	      }
	      if(flag==true) {
    		  System.out.println("Sunny num");
    	  }else {
    		  System.out.println("Not Sunny num");
    	  }
	}

}
