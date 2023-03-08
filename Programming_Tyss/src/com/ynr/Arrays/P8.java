package com.ynr.Arrays;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      int[] a= {num};
	      for(int i=0;i<a.length;i++) {
	    	  if(a[i]%5==0) System.out.println("Yes it is multiple of 5");
	    	  else System.out.println("It is not multiple of 5");
	      }
	}

}
