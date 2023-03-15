package com.ynr.LeetCode;

import java.util.Scanner;

public class Profit$loss {
	
	public static int stock(int []prices,int buy,int sell){
		
	   int profit=prices[sell]-prices[buy];
  	    if(profit>0) {
  	    	return profit;
  	    }else {
  		  return 0;
  	     }
    }	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter the no of days");
	     int size=sc.nextInt();
	     
	     System.out.println("enter the price");
	     int[] ss=new int[size];
	     
	     for(int i=0;i<size;i++) {
	    	 ss[i]=sc.nextInt();	 
	     }
	     System.out.println("enter the buying day");
	     int d1=sc.nextInt();
	     
	       if(d1<=0) {
	    	   System.out.println("day not valid");
	       }else {
	           int dd1=d1-1;
	              System.out.println("enter the selling day");
	              int d2=sc.nextInt();
	              
	              if(d2<=0 ) {
	    	       System.out.println("day not valid");
	              }else {
	                int dd2=d2-1;
	                int d=stock(ss,dd1,dd2);
	                System.out.println(d+"/-Profit");
	     
	              }
	       }
     }
}
