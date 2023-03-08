package com.ynr.PatternPrgms;

import java.util.Scanner;

public class P27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        
        for(int r=1;r<=num;r++) {
      	  for(int c=r;c<=num;c++) {
      		  System.out.print(c);
      	  }
      	  System.out.println();
        }
	}

}
