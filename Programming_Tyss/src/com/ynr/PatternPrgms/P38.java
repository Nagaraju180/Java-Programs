package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
       
        for(int r=1;r<=num;r++) {
        	int count=1;
        	for(int i=1;i<=num-r;i++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*r-1;j++) {
        		if(j<r) {
        			System.out.print(count);
        			count++;
        	    }else {
        	    	System.out.print(count);
        	    	count--;
        	    }
        	}
        	System.out.println();
        }	

	}

}
