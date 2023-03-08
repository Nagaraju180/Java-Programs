package com.ynr.Arrays;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nums");
		int[] a=new int[5];
		for(int r=0;r<a.length;r++) {
	    	   a[r]=sc.nextInt();
	       }
	       		
		int[] b=a;
		for(int n:b)
		System.out.println(n);
	}

}
