package com.ynr.PatternPrgms;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        
        for(int r=1;r<=num;r++) {
        	for(int i=1;i<=num-r;i++)                          {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*r-1;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
