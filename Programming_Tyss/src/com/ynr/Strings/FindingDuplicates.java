package com.ynr.Strings;

public class FindingDuplicates {

	public static void main(String[] args) {
      String s="daddy";
      String s1="";
     
      for(int i=0;i<s.length();i++) {
    	  char ch=s.charAt(i);
    	if(s1.indexOf(ch)==-1) {
    		  int count=0;
    	    for(int j=i+1;j<s.length();j++) {
    		   if(ch==s1.charAt(j)) {
    			   count++;
    		   }
    	    }
    	    if(count>=1) {
        	  System.out.println(ch);
            }
            s1+=ch;
            System.out.println(s1);
        }
      }
}
}
