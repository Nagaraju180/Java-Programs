package com.ynr.PatternPrgms;

import java.util.Scanner;

public class Halo_mirror_pyramid {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a number:");
		   int num=sc.nextInt();
		   
		   for(int r=num;r>=1;r--) {
			   for(int i=1;i<=num-r;i++) {
				   System.out.print(" ");
			   }
			   for(int j=1;j<=2*r-1;j++) {
				   if(j==1||r==num||j==2*r-1)
				   System.out.print("*");
				   else System.out.print(" ");
			   }
			   System.out.println();
		   }
	}

}
