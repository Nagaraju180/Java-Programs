package com.ynr.Arrays;

import java.util.Scanner;

public class CountOcuurences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num=sc.nextInt();
		int count=0;
        int[] a=new int[5];//{10,20,30,60,30,80,40,30};
        
        for(int n=0;n<a.length;n++) {
        	a[n]=sc.nextInt();
        }
         for(int i=0;i<a.length;i++) {
    	   if(a[i]==num) {
    		   count++;
    	   }
         }
         System.out.println(count);
	}

}
