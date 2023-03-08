package com.ynr.Arrays;

import java.util.Scanner;

public class CheckEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num=sc.nextInt();
        int[] a= {10,20,30,60,80,40};
        boolean flag=true;
         for(int i=0;i<a.length;i++) {
    	   if(a[i]==num) {
    		 System.out.println("Yes entered num is avl");
    	 	 flag=false;
    		 break;
    		 
    	   }
         }if(flag) System.out.println("not matched");
	}

}
