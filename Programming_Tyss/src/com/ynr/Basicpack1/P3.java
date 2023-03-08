package com.ynr.Basicpack1;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=scn.nextInt();
        int b=scn.nextInt();
       //1 
        int res1=a>b?a:b;
         System.out.println(res1);
        //2 
         int res2=a<b?a:b;
         System.out.println(res2);
         //3
         String res3=a<0?"Negitive":"Positive";
         System.out.println(res3);
        //4
         String res4=a%2==0?"Odd":"Even";
         System.out.println(res4);
	}

}
