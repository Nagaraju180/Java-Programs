package com.ynr.Strings;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email Id:");
		
		String email=sc.next();
		boolean flag=false;
		if(email!=null) {
			if(email.contains("@")) {
					
				String[] s1=email.split("@");
				String user=s1[0];
				String domain=s1[1];
					if(user!=null && domain!=null) {
						for(int i=0;i<user.length();i++) {
						  if(  user.charAt(i)>='a' && user.charAt(i)<='z' && domain.contains(".com") || domain.contains(".in") && user.charAt(i)>=0 && user.charAt(i)<=9) {
							flag=true;
						  }
						}
					}
					 else {
						flag=false;
					 }
			}	if(flag==true)
				  System.out.println("Valid:)");
			    else
				  System.out.println("Not valid!");
		  }else {
			System.out.println("Enter Valid mail!");
		}

	}

}
