package com.ynr.Strings;

public class UptoLo_LotoUp_String {

	public static void main(String[] args) {
		String s1="ABCdef";
	      String res="";
	      for(int i=0;i<s1.length();i++)
	      {
	    	  if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
	    	  {
	    		  res+=(char)(s1.charAt(i)+32);
	    	  }
	    	  else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
	    	  {
	    		  res+=(char)(s1.charAt(i)-32);
	    	  }
	    	  else {
	    		  res+=s1.charAt(i);
	    	  }
	      }
	      System.out.println(res);
	}

}
