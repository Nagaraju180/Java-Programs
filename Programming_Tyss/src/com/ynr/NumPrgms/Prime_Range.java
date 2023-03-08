package com.ynr.NumPrgms;

import java.util.Scanner;

public class Prime_Range {

	public static void main(String[] args) {
		
				Scanner scn=new Scanner(System.in);
				System.out.print("Enter range:");
				int num=scn.nextInt();
				
				for(int i=0;i<=num;i++) {
					if(i<=1) continue;
					boolean flag=true;
					for(int j=2;j<=i/2;j++) {
						if(i%j==0) {
							flag=false;
							break;
						}
					}
					if(flag) {
						System.out.print(i+" ");
					}
				}
				
			
		
	}

}
