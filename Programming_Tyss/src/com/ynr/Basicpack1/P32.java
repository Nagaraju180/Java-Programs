package com.ynr.Basicpack1;

import java.util.Scanner;
public class P32 {
//Fibonacci series
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Range:");
	        int x=sc.nextInt();
	        int y=sc.nextInt() ;
	        
	        int a=0,b=1,c;
	        while(a<=y)
	        {
	        	if(a>=x)System.out.println(a+"\t"); //its prints under range
	        		c=a+b;
	        		a=b;
	        		b=c;
	        }
	}

}
