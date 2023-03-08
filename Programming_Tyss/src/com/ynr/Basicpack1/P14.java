package com.ynr.Basicpack1;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter your age");
      int age=scn.nextInt();
       
       if(age>=18) {
    	   System.out.println("Eligible to vote");
       }
       else {
    	   System.out.println("Not Eligible");
       }
	}

}
