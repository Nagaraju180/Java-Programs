package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		char ch='A';
		for(int r=1;r<=num;r++) {
			for(int c=1;c<=num;c++) {
				if(r==c) {
					System.out.print(ch);
					ch++;
				}else {
					System.out.print(r+c);
				}
			}
			System.out.println();
		}
	    	   
	    	
	}

}
