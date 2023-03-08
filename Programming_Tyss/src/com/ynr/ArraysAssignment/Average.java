package com.ynr.ArraysAssignment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int []a=new int[5];
       Scanner sc=new Scanner(System.in);
       System.err.println("Enter a elements");
       for(int i=0;i<a.length;i++) {
    	   a[i]=sc.nextInt();
       }
       int avg=0;
       int sum=0;
       for(int j=0;j<a.length;j++) {
    	  sum=sum+a[j];
    	  avg=sum/a.length;
       }
       System.out.println(avg);
	}

}
