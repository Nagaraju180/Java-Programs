package com.ynr.NumPrgms;

import java.util.Scanner;

public class Tech_Num {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      int sum=0;
	      int count=0;
	      int sq=0;
	       for(int i=1;i<=num;i++) {//counting
	    	  num/=10;
	    	  count++;
	       }
	      int d=1;
	        for(int i=1;i<=count;i++) {//power
	    	  d*=i;  
	        }
	      if(count%2==0) {   //if even then splitting
	    	  int of=count/2;
	    	  int n1=num%d;
	    	  int n2=num/d;
	    	  sum=n1+n2;
	    	  sq=sum*sum;
	      }
	      
	        if(sq==num) System.out.println("Tech num");
	        else System.out.println("Not tech num");
	}

}
