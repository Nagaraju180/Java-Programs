package com.ynr.Strings;

public class Palindrome2_String {

	public static void main(String[] args) {
		String s1="malayalam";
	      String temp=s1;
	      String rev="";
	      for(int i=s1.length()-1;i>=0;i--) {
	    	  rev=rev+s1.charAt(i);
	      }
	      
	      if(rev.equals(temp)) {
	    	  System.out.println("Pallindrome");
	      }else {
	    	  System.out.println("Not palindrome");
	      }
	}

}
