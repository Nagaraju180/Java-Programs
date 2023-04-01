package com.ynr.Strings;

public class ReplacingChar {

	public static void main(String[] args) {
      String s1="java";
      char[] a=s1.toCharArray();
      char ch='p';
      for(int i=0;i<a.length;i++) {
    	  if(a[i]=='v') {
    		  a[i]=ch;
    	  }else {
    		  a[i]=a[i];
    	  }
      }
      System.out.println(a);
	}

}
