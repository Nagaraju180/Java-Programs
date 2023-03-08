package com.ynr.Basicpack1;

import java.util.Scanner;

public class P52 {
	//7.Checking character is in lower case or upper case
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year");
		String s1=sc.next();
		
		if(s1.charAt(0)>='a' && s1.charAt(0)<='z') {
			System.out.println(s1+" is in LowerCase");
		}else {
			System.out.println(s1+" is in UpperCase");
		}
  }
}
