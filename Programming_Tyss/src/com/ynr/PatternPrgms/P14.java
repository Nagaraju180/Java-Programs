package com.ynr.PatternPrgms;

import java.util.Scanner;
//Increasing rows
public class P14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        char ch='z';
        for(int r=1;r<=num;r++) {
        	for(int c=1;c<=r;c++) {
        		System.out.print(ch);
        		
        	}
        	ch--;
        	System.out.println();
        }
	}

}
