package com.ynr.Basicpack1;

import java.util.Scanner;

public class P15 {
//sum of three numbers
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 3 numbers:");
     int num1=sc.nextInt();
     int num2=sc.nextInt();
     int num3=sc.nextInt();
     
     int sum=num1+num2+num3;
     System.out.println(sum);
     if(sum>50) System.out.println("The sum is greater than 50");
     else System.out.println("The sum is lesser than 50");
     
     
   	}

}
