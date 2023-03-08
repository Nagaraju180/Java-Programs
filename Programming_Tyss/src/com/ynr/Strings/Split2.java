package com.ynr.Strings;

import java.util.Scanner;

public class Split2 {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a sentences");
	      
	      String s1=sc.nextLine();
	      String[] arr=s1.split(" ");
	      
	      for(String s:arr) System.out.println(s);
	}

}
