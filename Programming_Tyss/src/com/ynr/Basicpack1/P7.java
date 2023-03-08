package com.ynr.Basicpack1;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=scn.nextInt();
       if(num%2!=0) {
    	   System.out.println(num+" Odd number");
       }
       else if(num%2==0) {
    	   System.out.println(num+" Even number");
       }
	}

}
