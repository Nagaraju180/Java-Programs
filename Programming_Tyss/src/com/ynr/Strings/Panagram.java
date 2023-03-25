package com.ynr.Strings;

public class Panagram {

	public static void main(String[] args) {
      String s="qwertyu iopasdfgh jklzxcvbnm";
      s=s.toLowerCase();
      boolean flag=true;
      
      for(char c='a';c<='z';c++) {
    	  if(s.indexOf(c)==-1) {
    		  flag=false;
    		  break;
    	  }
      }
      if(flag) 
    	  System.out.println("Panagram");
      else
    	  System.out.println("Not Panagram");
	}

}
