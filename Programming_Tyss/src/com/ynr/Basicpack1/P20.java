package com.ynr.Basicpack1;

import java.util.Scanner;
//1
public class P20 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter User Name:");
      String usname=sc.nextLine();
      System.out.println("Enter Password");
      long pwrd=sc.nextLong();
      char c=usname.charAt(0);
      
       if(c>='A'&&c<='Z'||c>='a'&&c<='z') {
    	   if(pwrd==123) {
    		   System.out.println("Login Successfull");
    	   }else {
    		   System.out.println("Login failed");
    	   }
       }else {
    	   System.out.println("Enter valid User name");
       }
	}

}
