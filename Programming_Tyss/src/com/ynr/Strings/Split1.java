package com.ynr.Strings;

public class Split1 {

	public static void main(String[] args) {
		String s1="Test Yantra";
	      String[]arr=s1.split(" "); //these method is taking the words between spaces.
	      for(String s:arr)
	      {
	    	  System.out.println(s);
	      }
	}

}
