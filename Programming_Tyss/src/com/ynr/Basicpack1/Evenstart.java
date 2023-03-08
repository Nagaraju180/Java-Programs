package com.ynr.Basicpack1;

import java.util.Scanner;

public class Evenstart {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       
       while(num>0) {
    	   num=num/10;
       }
        if(num%2==0) System.out.println("start with even");
    	else System.out.println("not started with even");
          
       
	}

}
