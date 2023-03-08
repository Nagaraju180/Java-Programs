package com.ynr.Arrays;

import java.util.Scanner;
//printing which element is prime
public class P6 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 4 numbers");
       int [] a=new int[4];
       for(int r=0;r<a.length;r++) {
    	   a[r]=sc.nextInt();
       }
       
       for(int i=1;i<a.length;i++) {
    	   if(a[i]%2!=0) System.out.println(a[i]);
       }
       
	}

}
