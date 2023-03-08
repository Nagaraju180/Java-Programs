package com.ynr.NumPrgms;

import java.util.Scanner;

public class AutomophicNum {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=sc.nextInt();
      
      int sq=num*num;
      boolean flag=true;
      while(num>0) {
    	  int rem1=num%10;
    	  int rem2=sq%10;
    	  num/=10;
    	  sq/=10;
    	  if(rem1==rem2) {
    		  System.out.println("Automophic num");
    		  flag=false;
    		  break;
          }if(flag) {
    		System.out.println("not Automophic num");	  
    	  }
      }
	}

}
