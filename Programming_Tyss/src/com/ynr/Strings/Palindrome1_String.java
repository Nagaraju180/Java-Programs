package com.ynr.Strings;

public class Palindrome1_String {

	public static void main(String[] args) {
		 String s="RACECAR";
		    s=s.toLowerCase();
		    
		    int i=0,j=s.length()-1;
		    while(i<j)
		    {
		    	if(s.charAt(i)!=s.charAt(j))
		    	{
		    		System.out.println("Not a Palindrome");
		    		System.exit(0);
		    	}
		    	i++;
		    	j--;
		    }
		    System.out.println("Pallindrome");
	}

}
