package com.ynr.Assingments;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
		 int num=sc.nextInt();
		 int sum=0;
		 
		 for(int i=1;i<=num;i++) {
			 if(num%i==0)
				 sum+=i;
		 }
		 System.out.println(sum);
	}

}
