package com.ynr.Basicpack1;

import java.util.Scanner;
//nth fibonacci
public class P56 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int a=0,b=1,c;
      
      for(int i=1;i<=num;i++) {
    	  c=a+b;
    	  a=b;
    	  b=c;
    	  int res=a;
    	  if(num==a) System.out.println(a);
      }
      
	}

}
