package com.ynr.Basicpack1;

import java.util.Scanner;

public class P38 {
//6.printing product of positive numbers
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter positive number");
       int num=sc.nextInt();
       int i=1;
       int product=1;
       do {
    	   product*=i;
    	  System.out.println(product);
    	  i++;
       }while(i<=num);
       
	}

}
