package com.ynr.Strings;

import java.util.Scanner;

public class CoutChar_EvenAscii {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a country name:");
	      String s=sc.next();
	      
	      int count=0;
	      for(int i=0;i<s.length();i++) {
	    	  char c=s.charAt(i);
	    	  
	    	  if(c%2==0) {
	    		  count++;
	    	  }
	      }
	      System.out.println(count);
	}
}
