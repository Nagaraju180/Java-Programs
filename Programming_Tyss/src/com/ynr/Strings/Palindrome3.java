package com.ynr.Strings;

public class Palindrome3 {

	public static void main(String[] args) {
      String s="malayalam";
      
      String rev="";
      for(int i=s.length()-1;i>=0;i--) {
    	  rev=rev+s.charAt(i);
      }
      
      char[] a=s.toCharArray();
      char[] b=rev.toCharArray();
      
      int i=0;
      while(i!=s.length()) {
    	  if(a[i]!=b[i]) {
    		  System.out.println("Not a palindrome");
    		  System.exit(0);
    	  }
    	  else {
    		  ++i;
    		 // continue;
    	  }
      }
      System.out.println("Palindrome");
	}

}
