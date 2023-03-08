package com.ynr.Strings;

import java.util.Scanner;

public class ValidEmailOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email Id:");
		
		String s=sc.next();

		boolean flag=false;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='@') {
			  String s1[]=s.split("@");
		
		      for(int j=0;j<s1.length;j++) {
						
			    if(s1[j]=="gmail.com") {
				  flag=true;
				  break;
			    }else {
				  flag=false;
			     }
		      }
		   }
		}
		if(flag==true)
			System.out.println("Valid:)");
		else
			System.out.println("Not valid!!");
		
	}

}
