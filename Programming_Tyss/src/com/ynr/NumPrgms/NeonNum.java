package com.ynr.NumPrgms;

import java.util.Scanner;

public class NeonNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a number");
	       int num=sc.nextInt();
	       int sum=0;
	       
	       int sq=num*num;//81
	       while(sq>0) {
	    	   int rem=sq%10; //1
	    	   sum+=rem;
	    	   sq/=10;//deleting
	       }
	       if(sum==num) System.out.println(num+" Neon number");
	       else System.out.println(num+" not Neon number");
	}

}
