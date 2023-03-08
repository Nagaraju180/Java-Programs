package com.ynr.Arrays;

import java.util.Scanner;

public class Occurence2nd {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter  elemnts");
      int [] a=new int[5];
      
      boolean flag=true;
      for(int r=0;r<a.length;r++) {
   	   a[r]=sc.nextInt();
      } 
      System.out.println("Enter a number");
      int num=sc.nextInt();
      
      int count=0;
      
      for(int i=0;i<a.length;i++) {
    	  if(num==a[i]) count++;
    	  if(count==2){
    		 System.out.println("Index num="+i);
    	     flag=false;
    	     break;
    	  }
      } 
      if(flag) System.out.println("Not occured");
      
	}

}
