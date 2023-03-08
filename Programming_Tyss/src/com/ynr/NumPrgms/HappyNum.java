package com.ynr.NumPrgms;

import java.util.Scanner;

public class HappyNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      
	      while(true) {
	    	  int sum=0;
	       while(num>0) {
	    	  int dig=num%10;
	    	  sum=dig*dig;
	    	  num/=10;
	    	  System.out.println(sum);
	       }
	       num=sum;
	       if(sum==1) {
	    	   System.out.println("Happy num");
	    	   break;
	       }else if(sum==4)System.out.println("Sad num");
	       
	      }
	     
	      
	    	  
	      
	}

}
