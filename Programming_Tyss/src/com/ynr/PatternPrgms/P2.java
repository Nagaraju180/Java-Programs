package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P2 {
//printing columns
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	    for(int r=1;r<=num;r++) {
	    	for(int c=1;c<=num;c++) {
	    		System.out.print(c);
	    	}
	    	System.out.println();
	    }
	}

}
