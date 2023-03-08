package com.ynr.Strings;

import java.util.Scanner;

public class PartOfTheData {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter any words");
	      
	      String s1=sc.next();
	      
	      System.out.println(s1.substring(2,7));
	}

}
