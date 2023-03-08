package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for(int r=1;r<=num;r++) {
        	char ch='a';
        	for(int i=1;i<=num-r;i++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*r-1;j++) {
        		System.out.print(ch);
        		ch++;
        	}
        	System.out.println();
        }	

	}

}
