package com.ynr.Strings;

public class CountingWords {

	public static void main(String[] args) {
      String s1="java is worst lang";
       int count=0;
      for(int i=0;i<s1.length()-1;i++) {
    	  if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
    		  count++;
    	  }
      }
      System.out.println(count);
       
      
//      String[] s2=s1.split(" ");
//      System.out.println(s2.length);
	}

}
