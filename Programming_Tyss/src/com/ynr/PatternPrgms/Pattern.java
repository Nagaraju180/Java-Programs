package com.ynr.PatternPrgms;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      
           for(int i=1;i<=num;i++) {
        	      System.out.print("*");
           }
           System.out.println();
           for(int i=1;i<=num;i++) {
        	    System.out.print(i);
           } 
           for(int i=1;i<=num;i++) {
        	   if(i%2==0) System.out.println("0");
        	   else System.out.println("1");
           }
	}

}
