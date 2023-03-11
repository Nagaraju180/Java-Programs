package com.ynr.Strings;

import java.util.Scanner;

public class CountEachchars_withoutBuiltin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a String:");
	    String s1=sc.nextLine();
	    String s2="";      
        int i=0;
        while(i<s1.length()) {
    	  char  c=s1.charAt(i);
    	   i++;
    	  int count=1;
    	  while(i<s1.length() && s1.charAt(i)==c) {
    		   count++;
    		   i++;
    	   }
    	   System.out.println(c+"="+count);
    	   s2=s2+c;
       }
	}
}
