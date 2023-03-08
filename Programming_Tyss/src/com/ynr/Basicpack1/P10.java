package com.ynr.Basicpack1;

import java.util.Scanner;

public class P10 {
  //Check character is alphabet,number or special character
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a Character:");
	      String s=scn.next();
	      char c= s.charAt(0);
	      if(c>='A'&&c<='Z'||c>='a'&&c<='z') {
	    	  System.out.println(s+" is an alphabet");
	      }
	      else if(c>='0' && c<='9') {
	    	  System.out.println(s+" is a number");
	      }
	      else {
	    	  System.out.println(s+" is special charecter");
	      }
	}

}
