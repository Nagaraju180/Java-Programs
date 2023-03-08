package com.ynr.NumPrgms;

import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
		 int num=sc.nextInt();
		 int len=0;
	     int temp=num;
			 while(num>0) {
			    num/=10;
			    len++;
			 }
			  num=temp;
			  int sum=0;
			    while(num>0) {
			      int digit=num%10;
			      int product=1;
			    	for(int i=1;i<=len;i++) {
			    	  product*=digit;
			        }
			     sum+=product;
			     num/=10;
			    }
			    if(temp==sum) System.out.println("ArmStrong Number");
			     else System.out.println("Not an ArmStrong Number");

	}

}
