package com.ynr.Basicpack1;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any number:");
      int num=sc.nextInt();
      if(num>=65&&num<=90) {
    	  System.out.println("Upper case letter");
      }else if(num>=97&&num<=122){
    	  System.out.println("Lower case letter");
      }
      else {
    	  System.out.println("Not alphabet");
      }
	}

}
