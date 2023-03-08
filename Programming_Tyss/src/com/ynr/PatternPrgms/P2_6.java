package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P2_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        
        for(int r=5;r>=0;r--) {
        	for(int c=1;c<=r;c++) {
        			System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
