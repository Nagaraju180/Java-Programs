package com.ynr.NumPrgms;

import java.util.Scanner;

public class DuckNum {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a num");
     int num=sc.nextInt();
     int count=0;
     while(num>0) 
     {
    	 System.out.println(num);
    	 int digit=num%10;
    	 if(digit==0) {
    		 count++;
    	 }
    	 num/=10;
     }
     if(count>=1) 
    	 System.out.println("Duck number");
     else
    	 System.out.println("Not Duck num");
     
	}

}
