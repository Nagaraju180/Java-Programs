package com.ynr.Strings;

import java.util.Scanner;

public class email {

	public static void main(String[] args) {
		
	    Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
				
		boolean flag=false;
				if(s.contains("@"))
				{
				  String[] s2=s.split("@");
				  String user=s2[0];
				  String domain=s2[1];
					if(domain.isEmpty())  flag=false;
					if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
					{
						if( domain.contains("..") || domain.startsWith(".") || domain.endsWith(".")) flag=false;
						
						if(s.endsWith(".com") || s.endsWith(".in") )
								{
								//System.out.println("Valid email id");
								//flag=true;
								}
						
						else {
							//System.out.println("Invalid email id");
							flag=false;
						}
					}
					
					else
					{
						//System.out.println("Invalid email id");
						flag=false;
					}
	
					}
					else {
						//System.out.println("Invalid email id");
						flag=false;
					}
					if(flag==true) 
						System.out.println("valid");
					else
						System.out.println("Invalid email id");
	}

}
