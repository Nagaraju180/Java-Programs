  package com.ynr.NumPrgms;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scn.nextInt();
		
		int temp=num;
		
			int sum=0;
			while(num>0)
			{
				int rem=num%10;
				int fact=1;
				for(int i=1;i<=rem;i++)
				{
					fact*=i;
				}
				sum+=fact;
				num/=10;
			}
			if(sum==temp)System.out.println("Strong Num");
			else System.out.println("Not a Strong num");
		
	}

}
