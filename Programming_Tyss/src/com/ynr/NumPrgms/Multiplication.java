package com.ynr.NumPrgms;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter the Range:");
	      int num=scn.nextInt();
	      
	      for(int i=1;i<=20;i++) {
	    	  System.out.println(num+"*"+i+"="+(num*i));
	      }
	}

}
