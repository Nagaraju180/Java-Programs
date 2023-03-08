package com.ynr.Assingments;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
		 int num=sc.nextInt();
		 
		 int temp=num;
		 int sq=num*num;
		 int sum=0;
		 while(sq>0) {
			 int rem=sq%10;
			 sum=sum+rem;
			 sq/=10;
		 }
		 if(sum==temp) System.out.println("Neon");
		 else System.out.println("Not neon");
		 
	}

}
