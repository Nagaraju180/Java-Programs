package com.ynr.PatternPrgms;

import java.util.Scanner;
//Increasing columns
public class P13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for(int r=1;r<=num;r++) {
        	char ch='z';
        	for(int c=1;c<=r;c++) {
        		System.out.print(ch);
        		ch--;
        	}
        	System.out.println();
        }
	}

}
