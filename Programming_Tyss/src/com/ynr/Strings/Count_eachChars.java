package com.ynr.Strings;

public class Count_eachChars {

	public static void main(String[] args) {
		String s1="hello";
	      char c;
	      String s2="";  
	      
	      while(s1.length()-1>0)
	      {
	    	 c=s1.charAt(0);
	    	 s2= s1.replace(c+"","");
	    	 int count = s1.length()-s2.length();  
	    	 s1=s2;
	    	 
	    	  System.out.println(c+"="+count);
	      }
	}

}
 