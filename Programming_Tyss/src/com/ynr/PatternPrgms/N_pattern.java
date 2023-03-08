package com.ynr.PatternPrgms;

import java.util.Scanner;

public class N_pattern {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number:");
       int num=sc.nextInt();
       
       for(int r=1;r<=num;r++) {
    	   for(int c=1;c<=num;c++) {
    		   if(c==1||c==num||r==c) {
    			   System.out.print("N");   
    		   }else {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
       
	}

}
