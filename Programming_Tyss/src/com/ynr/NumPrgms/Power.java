package com.ynr.NumPrgms;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		
				Scanner scn=new Scanner(System.in);
				System.out.print("Enter base:");
				int base=scn.nextInt();
				
				System.out.print("Enter power:");
				int pow=scn.nextInt();
				int temp=1;
					
				for(int i=1;i<=pow;i++) {
					 temp=temp*base;
				}
				
				System.out.print(" = "+temp);
			
		
	}

}
