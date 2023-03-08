package com.ynr.Strings;

import java.util.Scanner;

public class Concat_method {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter two Strings");
	      
	      String s1=sc.next();
	      String s2=sc.next();
	      System.out.println(s1.concat(s2));
	}

}
