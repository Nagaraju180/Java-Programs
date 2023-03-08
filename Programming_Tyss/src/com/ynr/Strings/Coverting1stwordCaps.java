package com.ynr.Strings;

public class Coverting1stwordCaps {

	public static void main(String[] args) {
      String s="java is an oops lang";
      String s1="";
            
      for(int i=0;i<s.length();i++) 
      {
    	  char ch=s.charAt(i);
    	  if(ch==' ') 
    	  {
    		s1 =s1+" "+(char)(s.charAt(i+1)-32);
    		i++;
    	  }else 
    	  {
    		  s1=s1+ch;
    	  }
      }
      System.out.println(s1);
	}

}
