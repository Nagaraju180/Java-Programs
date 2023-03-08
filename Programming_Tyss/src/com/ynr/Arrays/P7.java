package com.ynr.Arrays;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=sc.nextInt();
      int[] a= {num};
      for(int i=0;i<a.length;i++) {
    	  if(a[i]%2==0) System.out.println("Even");
    	  else System.out.println("Odd");
      }
	}

}
