package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P1_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        
        
        for(int r=1;r<=num;r++) {
        	for(int i=1;i<=num-r;i++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=r;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
