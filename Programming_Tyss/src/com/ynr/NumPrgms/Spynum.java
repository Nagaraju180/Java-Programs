package com.ynr.NumPrgms;

import java.util.Scanner;
//Spy number
public class Spynum {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int num=sc.nextInt();
     
     int sum=0;
     int pro=1;
     while(num>0) {
    	int rem= num%10;
    	sum=sum+rem;
    	pro*=rem;
    	num/=10;
     }
     System.out.println(sum+" Sum");
     System.out.println(pro+" Product");
     if(sum==pro) {
    	 System.out.println("-It is spy number");
     }else {
    	 System.out.println("-Not a spy number");
     }
	}

}
